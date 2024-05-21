package com.greatlearning.sers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.sers.entity.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {
	
	public User getUserByUsername(String username);
}