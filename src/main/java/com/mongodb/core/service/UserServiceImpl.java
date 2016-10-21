package com.mongodb.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.core.dao.UserDao;
import com.mongodb.core.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User getUser(Integer id, String name) {
		return userDao.getUser(id, name);
	}
}