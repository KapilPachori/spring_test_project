package com.netsutra.api.testapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "test_user")
@Data
public class User {
	

	@Id
	@Column(name = "user_id")
	@GeneratedValue
	private Long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "gender")
	private Boolean gender;

	@Column(name = "status")
	private String status;

}
