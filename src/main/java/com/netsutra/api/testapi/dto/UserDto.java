package com.netsutra.api.testapi.dto;

import lombok.Data;

@Data
public class UserDto {
	
	private Long id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String address;
	
	private String gender;

	private String status;
	
	private Checkbox1Dto checkbox1;
	
	private Checkbox2Dto checkbox2;
	
	private Checkbox3Dto checkbox3;


}
