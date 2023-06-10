package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Delivery;
import com.example.demo.Model.Login;
import com.example.demo.Repository.DeliveryRepo;
import com.example.demo.Service.DeliveryService;
@CrossOrigin
@RestController
public class DeliveryControl {
	@Autowired
	public DeliveryService dserv;
	@Autowired
	public DeliveryRepo drepo;
	
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
	@GetMapping("/get/{id}")
	public List<Delivery> bycustomerid(@PathVariable("id") int id)
	{
		return drepo.bycustomerid(id);
	}
	@PutMapping("/put/{id}")
	public Delivery updateDetails (@PathVariable("id")int id ,@RequestBody Delivery dv)
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
	//sort
	@GetMapping("/sort/{inr}")
	public List<Delivery> sort(@PathVariable("inr") String price)
	{
		return dserv.sort(price);
	}
	//paginate
	@GetMapping("pagination/{nm}/{sp}")
	public List<Delivery> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)
	{
		return dserv.paginate(num,size);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Delivery> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String price)
	{
		return dserv.paginate(num,size,price);
	}
	@GetMapping("/getque")
	public List<Delivery> getAllData()
	{
		return drepo.getAllData();
	}
	@GetMapping("/getstartend/{st}/{en}")
	public List<Delivery> startend(@PathVariable("st") int st,@PathVariable("en") int en)
	{
		return drepo.startend(st,en);
	}
	
	@DeleteMapping("/deletque/{id}/{name}")
	public String deleteb(@PathVariable("st") int st,@PathVariable("name") String name)
	{
		 drepo.deletebyId(st,name);
		 return "The Given Id is deleted";
	}
	@PutMapping("/updateque/{id}/{name}")
	public void updateque(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		 drepo.updateDelete(id, name);
	}
	
	//login
	@PostMapping("/postlog")
	public Login postLog(@RequestBody Login lg)
	{
		return dserv.postLog(lg);
	}
	@GetMapping("/getlog")
	public List<Login> getLog()
	{
		return dserv.getLog();
	}
	
//	@PostMapping("/login")
//	public String login(@RequestBody Map<String,String> loginDataMap)
//	{
//		String loginname = loginDataMap.get("loginname");
//		String loginpassword = loginDataMap.get("loginpassword");
////		String result = dserv.loginCheckData(loginname, loginpassword);
//		return result;
//	}
}
