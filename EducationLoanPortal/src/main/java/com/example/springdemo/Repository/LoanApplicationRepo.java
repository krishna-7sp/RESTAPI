package com.example.springdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.Model.LoanApplicationModel;
@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{

}