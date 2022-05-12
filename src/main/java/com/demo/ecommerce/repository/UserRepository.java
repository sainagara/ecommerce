package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
