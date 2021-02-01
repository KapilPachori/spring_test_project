package com.netsutra.api.testapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netsutra.api.testapi.dto.UserDto;
import com.netsutra.api.testapi.entity.User;
import com.netsutra.api.testapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping
	public ResponseEntity<Iterable<User>> findAll() {
		try {
			return new ResponseEntity<Iterable<User>>(userService.findAllUsers(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Iterable<User>>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody UserDto userDto){
		try {
			return new ResponseEntity<User>(userService.saveUser(userDto), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody UserDto userDto){
		try {
			return new ResponseEntity<User>(userService.updateUser(id, userDto), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping(value = "get-user/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) {
		try {
			return new ResponseEntity<User>(userService.findUserById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}	

}
