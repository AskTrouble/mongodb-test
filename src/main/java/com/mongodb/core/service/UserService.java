package com.mongodb.core.service;

import com.mongodb.core.entity.User;

public interface UserService {
	User getUser(Integer id, String name);
}