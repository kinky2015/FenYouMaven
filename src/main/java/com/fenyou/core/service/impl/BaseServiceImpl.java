package com.fenyou.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenyou.core.dao.BaseDao;

@Service("baseService")
public class BaseServiceImpl<T> extends AbstractBaseService<T>
{
	@Autowired
	private BaseDao<T> baseDao;
}
