package com.fenyou.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenyou.core.dao.UserDao;
import com.fenyou.core.service.UserService;
@Service("userService")
public class UserServiceImpl<T> implements UserService<T>{
	@Autowired
	private UserDao<T> userDao;
}
