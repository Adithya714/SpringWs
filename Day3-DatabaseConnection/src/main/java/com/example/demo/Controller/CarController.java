package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CarModel;
import com.example.demo.Service.CarService;

@RestController
public class CarController {
	@Autowired
	public CarService cserv;
	@PostMapping("/service")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cserv.saveInfo(cr);
	}

}
