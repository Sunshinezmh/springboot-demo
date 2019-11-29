package com.dmsdbj.team.springbootdemo.controller.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dmsdbj.team.springbootdemo.controller.IUserController;
import com.dmsdbj.team.springbootdemo.entity.User;
import com.dmsdbj.team.springbootdemo.service.IUserService;
import com.dmsdbj.team.springbootdemo.utils.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author sunshine
 * @since 2019-11-01
 */
@RestController
@Slf4j
public class UserController implements IUserController {

	@Autowired
	private IUserService userService;

	@Override
	@Log
	public User getUser(int id) {
		log.info("用户输入的ID:[{}]", id);
		User user = userService.getById(id);
		return user;

	}

	@Override
	public IPage getUserList(Page page) {
		log.info("用户输入的page:[{}]", page);
		IPage iPage = userService.page(page);
		return iPage;
	}

	@Override
	public String removeUser(int id) {
		log.info("用户输入的ID:[{}]", id);
		userService.removeById(id);
		return "success remove userId=" + id;
	}

	@Override
	public String saveUser(User user) {
		log.info("用户输入的ID:[{}]", user);
		userService.save(user);
		return "success insert user =" +user;
	}

	@Override
	public List<User> getUserByLikeName(String name) {
		List<User> userList = userService.getUserByLikeName(name);
		return userList;
	}
}
