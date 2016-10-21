package com.mongodb.core.dao;

import com.mongodb.core.entity.User;

public interface UserDao {
	User getUser(Integer id, String name);
}