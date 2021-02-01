package com.netsutra.api.testapi.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netsutra.api.testapi.dao.UserRepository;
import com.netsutra.api.testapi.dto.UserDto;
import com.netsutra.api.testapi.entity.User;
import com.netsutra.api.testapi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userDao;

	@Override
	public User saveUser(UserDto userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setStatus(userDto.getStatus());
		user.setGender(false);
		userDao.save(user);
		
		return user;
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.findAll();
		 
	}

	@Override
	public User updateUser(Long id, UserDto userDto) {
		
		Optional<User> findUser = userDao.findById(id);
		User user = null;
		if(findUser.isPresent()) {
			user = findUser.get();
			user.setName(userDto.getName());
			user.setStatus(userDto.getStatus());
			userDao.save(user);
		}
		
		return findUser.get();
	}

	@Override
	public User findUserById(Long id) {
		Optional<User> findById = userDao.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

}
