package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Delivery;
import com.example.demo.Service.DeliveryService;

@RestController
public class DeliveryControl {
	@Autowired
	public DeliveryService dserv;
	@PostMapping("/post")
	public Delivery saveDetails(@RequestBody Delivery dv)
	{
		return dserv.saveDetails(dv);
	}
	
	@GetMapping("/get")
	public List<Delivery> getInfo()
	{
		return dserv.getInfo();
	}
	@PutMapping("/put")
	public Delivery updateDetails (@RequestBody Delivery dv)
	{
	    return dserv.updateDetails(dv);	
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		dserv.deleteDetails(id);
		return "Customer id "+id+"is deleted";
	}
	@DeleteMapping("/deletebyreq")
	public String deleteinfo(@RequestParam("id") int id )
	{
		dserv.deleteinfo(id);
		return "Customer id"+id+"is deleted";
	}
	@GetMapping("/findby/price/{price}")
	public List<Delivery> findbypri(@PathVariable("price") String price)
	{
		return dserv.findbypri(price);
	}
	@GetMapping("/sort/{inr}")
	public List<Delivery> sort(@PathVariable("inr") String price)
	{
		return dserv.sort(price);
	}
	@GetMapping("pagination/{nm}/{sp}")
	public List<Delivery> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
	{
		return dserv.paginate(num,size);
	}
}
