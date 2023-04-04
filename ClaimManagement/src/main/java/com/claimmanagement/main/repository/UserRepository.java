package com.claimmanagement.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claimmanagement.main.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);

}
