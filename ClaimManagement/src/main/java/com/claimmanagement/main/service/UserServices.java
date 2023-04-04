package com.claimmanagement.main.service;

import java.util.List;

import com.claimmanagement.main.entity.User;

public interface UserServices {
	public boolean authenticate(User user);
	public List<User> fetchAllUser();
	public User fetchByUsername(String userName);

}
