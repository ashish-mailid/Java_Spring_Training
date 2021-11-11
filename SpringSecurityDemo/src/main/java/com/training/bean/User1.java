package com.training.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@ToString
@Entity
@Table(name="user1")	
public class User1 {

	@Id
	@Column(name="username",length=100)
	private String username;
	private String password;
	private String roles;
	private boolean active;
}
