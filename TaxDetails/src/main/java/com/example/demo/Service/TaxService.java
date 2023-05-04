package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Tax.TaxerDetails;
import com.example.demo.TaxRepository.LoginRepo;
import com.example.demo.TaxRepository.Repository;

@Service
public class TaxService {
 @Autowired
 public LoginRepo lrepo;
 @Autowired 
 public Repository repo;

public TaxerDetails saveDet(TaxerDetails td) 
{	
	return repo.save(td);
}

public List<TaxerDetails> getAll() 
{	
	return repo.findAll();
}

public List<TaxerDetails> getAllMain() {
	
	return repo.findAll();
}

public void mainDel(int id) {
	repo.deleteById(id);
	
}


}
