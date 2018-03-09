package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {

	public User findByEmail(String email);
}
