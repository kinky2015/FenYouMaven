package com.fenyou.core.dao.impl;

import java.util.List;

import com.fenyou.core.dao.BaseDao;
/**
 * 
 * <pre>
 * 
 * </pre>
 *
 * @author jack
 * @version $Id: IBaseDao.java, v 0.1 2016年1月29日 下午4:06:09 jack Exp $
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

	public boolean save(T t)
	{
		return false;
	}

	public boolean update(T t)
	{
		return false;
	}

	public boolean remove(T t)
	{
		return false;
	}

	public List<T> getList()
	{
		return null;
	}

	public List<T> hqlQuery(String hql)
	{
		return null;
	}

	public List<T> sqlQuery(String sql)
	{
		return null;
	}
}
