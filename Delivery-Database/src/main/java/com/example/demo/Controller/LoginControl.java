package com.example.demo.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Login;
import com.example.demo.Service.LoginService;

@RestController
@CrossOrigin
public class LoginControl {
	  @Autowired
	   LoginService signSer;
	   @PostMapping("/rpost")
	   public Login save(@RequestBody Login s)
	   {
		   return signSer.save(s);
	   }
	   
	   @PostMapping("/logging")
	   
	   public String login(@RequestBody Map<String,String> loginData) {
		 	 String email = loginData.get("email");
		 	 String password = loginData.get("password");
			 String result = signSer.checkLogin(email,password);
			 return result;
		   }
}