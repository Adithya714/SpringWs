package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Delivery;
import com.example.demo.Repository.DeliveryRepo;

@Service
public class DeliveryService {

	@Autowired
	public DeliveryRepo drepo;
	public Delivery saveDetails(Delivery dv) {
		return drepo.save(dv);
	}
	
	public List<Delivery> getInfo() {
		return drepo.findAll();
	}

	public Delivery updateDetails(Delivery dv) {
		
		return drepo.saveAndFlush(dv);
	}

	public void deleteDetails(int id) {
		drepo.deleteById(id);
		
	}
	public void deleteinfo(int id) {
		drepo.deleteById(id);
		
	}

	public List<Delivery> findbypri(String price) {
		return drepo.findByprice(price);
	}

}
