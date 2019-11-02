package com.dmsdbj.team.springbootdemo.service;
import	java.util.List;

import com.dmsdbj.team.springbootdemo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunshine
 * @since 2019-11-01
 */
public interface IUserService extends IService<User> {

	List<User> getUserByLikeName(String queryName);
}
