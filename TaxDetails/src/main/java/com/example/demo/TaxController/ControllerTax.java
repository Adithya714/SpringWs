package com.example.demo.TaxController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TaxService;

@RestController
public class ControllerTax {
	@Autowired
	public TaxService tserv;		
}
