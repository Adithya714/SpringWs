package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Brand;
import com.example.demo.Repository.BrandRepo;
import com.example.demo.Service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {
	@Autowired
	public BrandService serv;
	@Autowired
	public BrandRepo repo;
 	@PostMapping("/post")
 	public Brand saveDet(@RequestBody Brand br)
 	{
 		return serv.saveDet(br);
 	}
 	@GetMapping("/get")
 	public List<Brand> getAll()
 	{
 		return repo.getAll();
 	}
 	@GetMapping("/getid/{id}")
 	public List<Brand> getById(@PathVariable("id") int id)
 	{
 		return repo.getById(id);
 	}
 	@DeleteMapping("/del/{id}")
 	public String delById(@PathVariable("id") int id)
 	{
 		repo.deleteById(id); 	
 		return "The give id "+id+" is daleted";
 	}
 	@PutMapping("/put/id")
 	public Brand updateDet(@RequestBody Brand br,@PathVariable("id") int id)
 	{
 		return repo.updateDet(br,id);
 	}
 	
}




