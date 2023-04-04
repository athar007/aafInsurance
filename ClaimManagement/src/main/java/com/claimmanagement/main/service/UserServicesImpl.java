package com.claimmanagement.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claimmanagement.main.entity.User;
import com.claimmanagement.main.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	UserRepository userrepo;

	@Override
	public boolean authenticate(User user) {
		List<User> users = fetchAllUser();
		for(User userDetail : users) {
			if(userDetail.getUserName().equals(user.getUserName())) {
				if(userDetail.getPassword().equals(user.getPassword())) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public List<User> fetchAllUser() {
		return userrepo.findAll();
	}

	@Override
	public User fetchByUsername(String userName) {
		List<User> users = fetchAllUser();
		User userInfo = new User();
		for(User userDetail : users) {
			if(userDetail.getUserName().equals(userName)) {
				userInfo = userDetail;
			}
		}
		return userInfo;
	}

}
