package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getInvalidCount() {
		return invalidcount;
	}

	public void setInvalidCount(int invalidCount) {
		this.invalidcount = invalidCount;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public User(String email, String password, int invalidCount, String locked) {

		this.email = email;
		this.password = password;
		this.invalidcount = invalidCount;
		this.locked = locked;
	}
	
	public User() {
		
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", invalidCount=" + invalidcount + ", locked="
				+ locked + "]";
	}
	
	
}
