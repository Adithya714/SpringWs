package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ExampleService;
import com.example.demo.example.Example;
@RestController
public class ExampleController 
{
	@Autowired
	public ExampleService eser;
	@PostMapping("/example")
	public Example addDetails(@RequestBody Example exe)
	{
		return eser.saveInfo(exe);
	}
}
