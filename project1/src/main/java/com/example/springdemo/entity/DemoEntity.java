package com.example.springdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoEntity {
	@Id
private int id;
	private String name;
	private String email;
	private String dept;
	private String clas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	
	
}
