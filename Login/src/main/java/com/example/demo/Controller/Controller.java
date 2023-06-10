package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Login;
import com.example.demo.Service.LogService;

@RestController
public class Controller {
	@Autowired
	
	public LogService serv;
	@PostMapping("/post")
	public Login saveDet(Login lg)
	{
		return serv.saveDet()
	}

}
