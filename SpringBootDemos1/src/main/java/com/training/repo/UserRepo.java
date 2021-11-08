package com.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
