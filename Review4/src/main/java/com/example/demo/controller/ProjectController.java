package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoanApplicationModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {
    
	@Autowired
	public ProjectService serv;
    
	@GetMapping("/user/getall")
	public List<UserModel> getUser()
	{
		return serv.getUser();
	}
	
	@PostMapping("/user/post")
	public UserModel postuser(@RequestBody UserModel um)
	{
		return serv.postuser(um);
	}
	
	@DeleteMapping("/user/delete/{id}")
	public String deluser(@PathVariable("id")int id)
	{
		serv.deluser(id);
		return "Deletion was Successful";
				
	}
	
	@PutMapping("/loan/update")
	public UserModel updet(@RequestBody UserModel um)
	{
		return serv.updet(um);
	}
	
	
	
	
		@GetMapping("/loan/getall")
		public List<LoanApplicationModel> getloan()
		{
			return serv.getloan();
		}
		
		@PostMapping("/loan/post")
		public LoanApplicationModel postloan(@RequestBody LoanApplicationModel um)
		{
			return serv.postloan(um);
		}
		
		@DeleteMapping("/loan/delete/{id}")
		public String delloan(@PathVariable("id")int id)
		{
			serv.delloan(id);
			return "Deletion was Successful";
					
		}
		
		@PutMapping("/user/update")
		public LoanApplicationModel uploan(@RequestBody LoanApplicationModel um)
		{
			return serv.uploan(um);
		}
	
	
}
