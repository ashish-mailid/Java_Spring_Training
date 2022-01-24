package com.training.bean;


import org.springframework.data.annotation.Id;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;*/

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("user1") // for mongodb
//@Entity  // comment for mongo db
//@Table(name="user1") //comment for mongodb
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class MyUser {
	
	@Id
	//@Column(name="username",length = 100)
	private String username;
	private String password;
	private boolean active;
	private String roles;
	

}
