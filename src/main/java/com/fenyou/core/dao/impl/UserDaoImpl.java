package com.fenyou.core.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.fenyou.core.dao.UserDao;
import com.fenyou.core.model.User;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<Object> implements UserDao<Object>{


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
