package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CarModel;
import com.example.demo.Repository.CarRepo;

@Service
public class CarService {
	@Autowired
     public CarRepo crepo;
     public CarModel saveInfo(CarModel c)
     {
    	 return crepo.save(c);
     }
}
