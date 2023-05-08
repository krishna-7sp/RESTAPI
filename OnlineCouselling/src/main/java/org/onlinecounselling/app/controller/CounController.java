package org.onlinecounselling.app.controller;

import java.util.List;
import java.util.Optional;

import org.onlinecounselling.app.service.CounService;
import org.onlinecounselling.app.model.CounModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "counselling")
public class CounController {
	
	@Autowired
	public CounService service;
	
	
	//Post Drug
	@PostMapping(value="/createCoun")
	public String addDrug(@RequestBody CounModel c){
		return service.createCoun(c);
	}
	
	
	//Get Drug by Id
	@GetMapping(value = "/getCoun")
	public Optional<CounModel> getCoun(@RequestParam(required = true) int i){
		return service.getCoun(i);
	}
	
	
	//Get All Drug
	@GetMapping(value = "/getCouns")
	public List<CounModel> getAllDrug(){
		return service.getAllCouns();
	}
	
	
	//Edit Drug
	@PutMapping(value = "/editCoun")
	public String updateDrugById(@RequestBody CounModel c, @RequestParam(required = true) int id){
		return service.updateCoun(c, id);
	}
	
	
	//Delete Drug
	@DeleteMapping(value = "/deleteDrug")
	public String deleteDrugByReqParam(@RequestParam int c){
		return service.deleteCoun(c); 
	}
	
	
	//Ascending Sorting
	@GetMapping(value = "/sortAsc")
	public List<CounModel> sortAsc(@RequestParam(required = true) String field){
		return service. sortAscending(field);
	}
		
		
	//Descending Sorting
	@GetMapping(value = "/sortDesc")
	public List<CounModel> sortDesc(@RequestParam(required = true) String field){
		return service. sortDescending(field);
	}
	
	
	//Pagination with sorting
	@GetMapping(value = "/pagination")
	public List<CounModel> paginationData(@RequestParam(value = "pnu", required = true) int pnu, @RequestParam(value = "psize", required = true) int psize, @RequestParam(value = "field", required = true) String field){
		return service.paginationAndSorting(pnu, psize, field);
	}
}