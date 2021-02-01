package com.netsutra.api.testapi.dto;

import lombok.Data;

@Data
public class UserDto {
	
	private Long id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private Boolean gender;

	private String status;


}
