package com.claimmanagement.main.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.claimmanagement.main.repository.UserRepository;

@Service
public class UserInfoService implements UserDetailsService {
	
	@Autowired
	private UserRepository userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		com.claimmanagement.main.entity.User userInfo = userrepo.findByUserName(userName).orElseThrow(()-> new UsernameNotFoundException("User Not Found!"));
		return new org.springframework.security.core.userdetails.User(userInfo.getUserName(), userInfo.getPassword(), new ArrayList<>());
	}

}
