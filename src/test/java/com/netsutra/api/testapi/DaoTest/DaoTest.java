package com.netsutra.api.testapi.DaoTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.netsutra.api.testapi.dao.UserRepository;
import com.netsutra.api.testapi.dto.UserDto;
import com.netsutra.api.testapi.entity.User;

@SpringBootTest
public class DaoTest {
	
	@Autowired
	UserRepository userRepository;
	
	
	@Test
	void testMy() {
		
		UserDto userDto = new UserDto(); 

		
		User user = new User();
		user.setName("Kapil");
		user.setEmail("er.kapilpachori@gmail.com");
		user.setPassword("kapil123");
		user.setStatus("New");
		user.setGender(true);
		
		
		userRepository.save(user);
		
		
	}

}
