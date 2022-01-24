package com.training.repo;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.training.bean.MyUser;

@Repository
public interface UserRepo extends MongoRepository<MyUser, String> /*JpaRepository<MyUser, String>*/{

	
}
