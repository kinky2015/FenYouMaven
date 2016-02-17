package com.fenyou.core.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.fenyou.core.dao.BaseDao;
import com.fenyou.core.util.LogUtils;

public abstract class AbstractBaseDao<T> implements BaseDao<T>
{
	@Autowired  
    @Qualifier("sessionFactory")  
    private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean save(T t)
	{
		try {
			sessionFactory.getCurrentSession().save(t);
			return true;
		} catch (Exception e) {
			LogUtils.log.error("保持失败："+e);
			return false;
		}
	}
	public boolean update(T t)
	{
		try
		{
			sessionFactory.getCurrentSession().update(t);
			return true;
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogUtils.log.error("更新失败"+e);
			return false;
		}
	}
	public boolean remove(T t)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(t);
			return true;
		}
		catch (Exception e)
		{
			// TODO: handle exception
			LogUtils.log.error("删除失败"+e);
			return false;
		}
	}
	@SuppressWarnings("unchecked")
	public List<T> getList()
	{
		String hql = "from " + getEntityClassName();
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	@SuppressWarnings("unchecked")
	public List<T> hqlQuery(String hql){
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return  query.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> sqlQuery(String sql){
		Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		return query.list();
	}
	protected String getEntityClassName() {
		ClassMetadata meta = sessionFactory.getCurrentSession().getSessionFactory().getClassMetadata(getEntityClass());
		return meta.getEntityName();
	}
	protected Class<T> getEntityClass(){
		@SuppressWarnings("unchecked")
		Class<T> entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return entityClass;
	}
}
