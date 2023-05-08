package com.example.springdemo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	private String email;
	private String pass;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}
	

}