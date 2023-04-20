package com.example.demo.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	@Value("${cname:Mustang}")
	public String cname;
	@GetMapping("/value")
public String display()
{
	return "My favourite car is "+cname;
}
}
