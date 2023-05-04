package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Brand;
import com.example.demo.Repository.BrandRepo;

@Service
public class BrandService {
	@Autowired
	public BrandRepo repo;
	
	public Brand saveDet(Brand br) 
	{	
		return repo.save(br);
	}
}
