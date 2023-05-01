package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UserDTO;
import com.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
//	@GetMapping("/get-user")
//	public UserDTO getUser() {
//		return userService.getUser();
//		
//	}
	@GetMapping("/get-user/{id}")
	public UserDTO getUser(@PathVariable String id) {
		return userService.getUser(id);
		
	}
	@GetMapping("/get-user")
	public UserDTO getUserWithRequestParam(@RequestParam(name="mail",required=false)String mail) {
		return userService.getUser(mail);
		
	}
	
	@PostMapping("/create-user")
	public void createUser(@RequestBody UserDTO userDTO) {
		userService.save(userDTO);
	}
	

	@PutMapping("/update-user")
	public void updateUser(@RequestBody UserDTO userDTO){
		userService.save(userDTO);
	}
	
	@DeleteMapping("/delete-user")
	public void deleteUser(@RequestBody UserDTO userDTO){
		userService.delete(userDTO);
	}
}
