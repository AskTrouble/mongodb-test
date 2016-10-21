package com.mongodb.core.dao;

import org.springframework.stereotype.Repository;

import com.mongodb.core.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Override
	public User getUser(Integer id, String name) {
		return new User(id, name);
	}
}