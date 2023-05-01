package com.service;

import com.dto.UserDTO;

public interface UserService {
    public UserDTO getUser();

	public UserDTO getUser(String id);

	public void save(UserDTO userDTO);

	public void delete(UserDTO userDTO);
}
