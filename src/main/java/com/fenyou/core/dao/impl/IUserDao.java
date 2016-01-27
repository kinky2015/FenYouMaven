package com.fenyou.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fenyou.core.dao.UserDao;
import com.fenyou.core.model.User;
@Repository("userDao")
public class IUserDao implements UserDao<Object>{
	@Resource
    private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean isExist(User user) {
		Session session = this.getSession();
		String hql = "from User where userName =? and passWord = ?";
		Query query = session.createQuery(hql);
		query.setString(0, user.getUserName());
		query.setString(1, user.getPassWord());
		if (query.list().size() >= 1) {
			return true;
		}else{
			session.save(user);
		}
		return false;
	}
	
}
