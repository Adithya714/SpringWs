package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoanApplicationModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.LoanApplicationRepository;
import com.example.demo.repository.UserRepository;

@Service
public class ProjectService {

	
	@Autowired
	public UserRepository urepo;
	
	@Autowired
	public LoanApplicationRepository lrepo;

	public List<UserModel> getUser() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	public UserModel postuser(UserModel um) {
		// TODO Auto-generated method stub
		return urepo.save(um);
	}

	public void deluser(int id) {
		// TODO Auto-generated method stub
		urepo.deleteById(id);
		
	}

	public UserModel updet(UserModel um) {
		// TODO Auto-generated method stub
		return urepo.saveAndFlush(um);
	}
	public List<LoanApplicationModel> getloan() {
		// TODO Auto-generated method stub
		return lrepo.findAll();
	}

	public LoanApplicationModel postloan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return lrepo.save(um);
	}

	public void delloan(int id) {
		// TODO Auto-generated method stub
		lrepo.deleteById(id);
		
	}

	public LoanApplicationModel uploan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return lrepo.saveAndFlush(um);
	}
	
	


	
	

}
