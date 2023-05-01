package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.dao.UserRepository;
import com.dto.UserDTO;
import com.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDTO getUser() {
		String email = "sudhaveni";
		User user = userRepository.findById(email).get();
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}

	@Override
	public UserDTO getUser(String id) {
		User user = userRepository.findById(id).get();
		UserDTO userDTO = new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}

	@Override
	public void save(UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		user.setInvalidCount(0);
		user.setLocked("no");
		User savedUser = userRepository.save(user);
		System.out.println(savedUser);
	}

	@Override
	public void delete(UserDTO userDTO) {
		String user = "hey";
		userRepository.deleteById(user);
	}
	

}
