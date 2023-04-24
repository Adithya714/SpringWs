package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Model;
import com.example.demo.Repository.TrainRepo;

@Service
public class TrainService {

	@Autowired
	public TrainRepo trepo;
	public Model saveInfo(Model mn) {
		
		return trepo.save(mn);
	}
	public List<Model> getInfo() 
	{
		return trepo.findAll();
	}
	public Model updateDetails(Model mn) {
		// TODO Auto-generated method stub
		return trepo.saveAndFlush(mn);
	}
	public void deleteInfo(int id) {
		// TODO Auto-generated method stub
		trepo.deleteById(id);
	}
	public void deleteIn(int id) {
		// TODO Auto-generated method stub
		trepo.deleteById(id);
	}
 
}
