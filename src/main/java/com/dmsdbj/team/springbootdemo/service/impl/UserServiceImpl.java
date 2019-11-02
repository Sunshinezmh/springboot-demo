package com.dmsdbj.team.springbootdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dmsdbj.team.springbootdemo.entity.User;
import com.dmsdbj.team.springbootdemo.mapper.UserMapper;
import com.dmsdbj.team.springbootdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunshine
 * @since 2019-11-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> getUserByLikeName(String queryName) {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.like("name", queryName);
		List<User> userList = userMapper.selectList(queryWrapper);
		return userList;
	}
}
