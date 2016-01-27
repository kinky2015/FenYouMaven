package com.fenyou.core.service;

import com.fenyou.core.model.User;

public interface UserService<T> {
	public boolean isExist(User user);
}
