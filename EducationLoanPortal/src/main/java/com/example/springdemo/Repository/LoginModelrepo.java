package com.example.springdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.Model.LoginModel;
@Repository
public interface LoginModelrepo extends JpaRepository<LoginModel,String>{

	void deleteByPass(String password);

}
