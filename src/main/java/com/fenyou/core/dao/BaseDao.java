package com.fenyou.core.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * <pre>
 * 基础Dao层
 * </pre>
 *
 * @author jack
 * @version $Id: BaseDao.java, v 0.1 2016年1月29日 下午4:06:26 jack Exp $
 */
public interface BaseDao<T> {
	/**
	 * 
	 * <pre>
	 * 保持
	 * </pre>
	 *
	 * @param t
	 * @return
	 */
	public boolean save(T t);
	/**
	 * 
	 * <pre>
	 * 更新
	 * </pre>
	 *
	 * @param t
	 * @return
	 */
	public boolean update(T t);
	/**
	 * 
	 * <pre>
	 * 删除
	 * </pre>
	 *
	 * @param t
	 * @return
	 */
	public boolean remove(T t);
	/**
	 * 
	 * <pre>
	 * 获取所有
	 * </pre>
	 *
	 * @return
	 */
	public List<T> getList();
	/**
	 * 
	 * <pre>
	 * 
	 * </pre>
	 *
	 * @param hql
	 * @return
	 */
	public List<T> hqlQuery(String hql);
	/**
	 * 
	 * <pre>
	 * 
	 * </pre>
	 *
	 * @param sql
	 * @return
	 */
	public List<T> sqlQuery(String sql);
}
