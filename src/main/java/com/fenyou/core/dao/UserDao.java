package com.fenyou.core.dao;

import com.fenyou.core.model.User;

public interface UserDao<T> {
	public boolean isExist(User user);
}
