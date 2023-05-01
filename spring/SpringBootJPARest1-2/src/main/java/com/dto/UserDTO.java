package com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDTO {

	@Id
	private String email;
	
	private String password;

	private int invalidcount;

	private String locked;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getInvalidcount() {
		return invalidcount;
	}

	public void setInvalidcount(int invalidcount) {
		this.invalidcount = invalidcount;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	

	public UserDTO(String email, String password, int invalidcount, String locked) {
	
		this.email = email;
		this.password = password;
		this.invalidcount = invalidcount;
		this.locked = locked;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDTO() {
		
	}

	@Override
	public String toString() {
		return "UserDTO [email=" + email + ", invalidcount=" + invalidcount + ", locked=" + locked + "]";
	}

	
}
