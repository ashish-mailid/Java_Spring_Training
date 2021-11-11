package com.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.bean.User1;

public interface UserRepo extends JpaRepository<User1,String> {

}
