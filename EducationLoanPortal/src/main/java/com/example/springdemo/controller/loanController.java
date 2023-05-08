package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.Model.AdminModel;
import com.example.springdemo.Model.LoanApplicationModel;
import com.example.springdemo.Model.LoginModel;
import com.example.springdemo.Model.UserModel;
import com.example.springdemo.service.loanService;

@RestController
public class loanController {

	@Autowired
    public loanService lser;
	  
	//AdminModel
	@PostMapping("/post1/Admin")
	public AdminModel postD(@RequestBody AdminModel amodel)
	{
		return lser.post1(amodel);
	}
	@GetMapping("/get1/Admin")
	public List<AdminModel> getD()
	{
		return lser.get1();
	}
	@PutMapping("/put1/Admin")
	public AdminModel putD(@RequestBody AdminModel amodel1)
	{
		return lser.put1(amodel1);
	}
	@DeleteMapping("/del1/Admin/{cpas}")
	public String deleteD(@PathVariable("cpas") String password)
	{
		lser.delete1(password);
		return "Deleted";
	}
	
	//LoanApplicationModel
	
	@PostMapping("/post2/LoanApp")
	public LoanApplicationModel postD1(@RequestBody LoanApplicationModel amodel3)
	{
		return lser.post2(amodel3);
	}
	@GetMapping("/get2/LoanApp")
	public List<LoanApplicationModel> getD1()
	{
		return lser.get2();
	}
	@PutMapping("/put2/LoanApp")
	public LoanApplicationModel putD1(@RequestBody LoanApplicationModel amodel4)
	{
		return lser.put2(amodel4);
	}
	@DeleteMapping("/del2/LoanApp/{cid}")
	public String deleteD1(@PathVariable("cid") int loanid)
	{
		lser.delete2(loanid);
		return "Deleted";
	}
	
	//LoginModel
	@PostMapping("/post3/LoginModel")
	public LoginModel postD2(@RequestBody LoginModel amodel5)
	{
		return lser.post3(amodel5);
	}
	@GetMapping("/get3/LoginModel")
	public List<LoginModel> getD2()
	{
		return lser.get3();
	}
	@PutMapping("/put3/LoginModel")
	public LoginModel putD2(@RequestBody LoginModel amodel6)
	{
		return lser.put3(amodel6);
	}
	@DeleteMapping("/del3/LoginModel/{apass}")
	public String deleteD2(@PathVariable ("apass")String password)
	{
		lser.delete3(password);
		return "Deleted";
	}
	
	//UserModel
	@PostMapping("/post4/UserModel")
	public UserModel postD3(@RequestBody UserModel amodel7)
	{
		return lser.post4(amodel7);
	}
	@GetMapping("/get4/UserModel")
	public List<UserModel> getD3()
	{
		return lser.get4();
	}
	@PutMapping("/put4/UserModel")
	public UserModel putD3(@RequestBody UserModel amodel8)
	{
		return lser.put4(amodel8);
	}
	@DeleteMapping("/del4/UserModel/{aid}")
	public String deleteD3(@PathVariable("aid") int id)
	{
		lser.delete4(id);
		return "Deleted";
	}
}
