package com.example.springdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.Model.UserModel;
@Repository
public interface UserModelRepo extends JpaRepository<UserModel,Integer>{

	
}
