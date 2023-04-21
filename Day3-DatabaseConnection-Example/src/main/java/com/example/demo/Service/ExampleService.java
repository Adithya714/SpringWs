package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ExampleRepo;
import com.example.demo.example.Example;

@Service
public class ExampleService 
{
	@Autowired
	public ExampleRepo erepo;
	public Example saveInfo(Example ex)
	{
		return erepo.save(ex);
	}
}
