package com.example.springdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.Model.AdminModel;
@Repository
public interface AdminModelRepo extends JpaRepository<AdminModel,String>{

	void deleteByPassword(String password);

}
