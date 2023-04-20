package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Display 
{
	@GetMapping("/")
	@ResponseBody
	public String display()
	{
		return "Hello World";
	}
}