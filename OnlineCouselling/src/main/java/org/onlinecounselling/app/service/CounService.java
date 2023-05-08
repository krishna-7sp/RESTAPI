package org.onlinecounselling.app.service;


import java.util.List;
import java.util.Optional;

import org.onlinecounselling.app.model.CounModel;
import org.onlinecounselling.app.repository.CounRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class CounService {
	
	@Autowired
	public CounRep repo;
	
	
	public String createCoun(CounModel coun){
		boolean value = repo.existsById(coun.getCounId());
	
		if(value == true){
			return "The user already exists. To enter the application please use login";
		}
		else{
			repo.save(coun);
			return "A new user with the details " + coun.toString() + " is created. Login to continue";
		}
	}
	
	
	public Optional<CounModel> getCoun(int id){
		boolean value = repo.existsById(id);
		if(value == true) {
			return repo.findById(id);
		}
		else {
			return null;
		}
	}
	
	
	public List<CounModel> getAllCouns(){
		return repo.findAll();
	}
	
	
	public String updateCoun(CounModel coun, int id){
		boolean value = repo.existsById(id);
		CounModel dummy = repo.findById(id).orElse(null);
		if(value == true) {
			dummy.setAge(coun.getAge());
			dummy.setCollege(coun.getCollege());
			dummy.setCutoff(coun.getCutoff());
			dummy.setEmail(coun.getEmail());
			dummy.setFirstName(coun.getFirstName());
			dummy.setLastName(coun.getLastName());
			dummy.setMark_10th(coun.getMark_10th());
			dummy.setMark_12th(coun.getMark_12th());
			dummy.setPhoneNumber(coun.getPhoneNumber());
			dummy.setUserName(coun.getUserName());
			
			repo.saveAndFlush(dummy);
			
			return "The drug details was successfully updated in the database";
		}
		else {
			return "The drug details is not present in the database to be updated";
		}
	}
	
	
	public String deleteCoun(int id){
		CounModel value = repo.findById(id).orElse(null);
		if(value != null) {
			repo.deleteById(id);
			return "Drug with id " + id + "is not deleted from the database";
		}
		else {
			return "Drug with id " + id + "is not deleted as it's not present in Database";
		}
	}
	
	
	public List<CounModel> sortAscending(String field){
		return repo.findAll(Sort.by(Direction.ASC, field));
	}
	
	
	public List<CounModel> sortDescending(String field){
		return repo.findAll(Sort.by(Direction.DESC, field));
	}
	
	
	public List<CounModel> paginationAndSorting(int pageNumber, int pageSize, String field){
		Page<CounModel> coun = repo.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(Direction.ASC, field)));
		return coun.getContent();
	}
}