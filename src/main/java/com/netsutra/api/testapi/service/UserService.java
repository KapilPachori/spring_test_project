package com.netsutra.api.testapi.service;

import java.util.List;

import com.netsutra.api.testapi.dto.PasswordDto;
import com.netsutra.api.testapi.dto.UserDto;
import com.netsutra.api.testapi.entity.User;

public interface UserService {
	
	Boolean checkCredential(PasswordDto passwordDto);
	
	public User saveUser(UserDto userDto);
	
	public User updateUser(Long id, UserDto userDto);
	
	List<User> findAllUsers();
	
	User findUserById(Long id);

}
