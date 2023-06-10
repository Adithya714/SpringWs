package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Delivery;
import com.example.demo.Model.Login;
import com.example.demo.Repository.DeliveryRepo;
import com.example.demo.Repository.LogRepo;

@Service
public class DeliveryService {

	@Autowired
	public DeliveryRepo drepo;
	@Autowired
	public LogRepo repo;
	
	public Delivery saveDetails(Delivery dv) 
	{
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

	public List<Delivery> sort(String price) {
		
		return drepo.findAll(Sort.by(price).descending());
	}

	public List<Delivery> paginate(int num, int size) 
	{
		Page<Delivery> p=drepo.findAll(PageRequest.of(num, size));
		return p.getContent();
		
	}

	public List<Delivery> paginate(int num, int size, String price) 
	{
		Page<Delivery> obj=drepo.findAll(PageRequest.of(num, size,Sort.by(price).ascending()));
		return obj.getContent();
	}

	public Login postLog(Login lg) {
		return repo.save(lg);
	}
	
	public List<Login> getLog() {
		
		return repo.findAll();
	}
}

//	public String loginCheckData(String loginname,String loginpassword)
//	{
//		Login user = repo.findByusername(loginname);
//		if(user == null)
//		{
//			return "No User Found/nPlease Try Again!!!!";
//		}
//		else
//		{
//			if(user.getPassword().equals(loginpassword))
//			{
//				return "Login Successful";
//			}
//			else
//			{
//				return "Login Failed";
//			}
//		}
//	}
