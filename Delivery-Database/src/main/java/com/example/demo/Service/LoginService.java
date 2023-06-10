package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Login;
import com.example.demo.Repository.LogRepo;



@Service
public class LoginService 
{
     @Autowired
     LogRepo signRep;
	public Login save(Login s) 
	{
		
		return signRep.save(s);
	}

	public String checkLogin(String email, String password) 
	{
		Login u = signRep.findByemail(email);
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	

	public Login update(Login s) 
	{
		
		return signRep.save(s);
	}

	

}

