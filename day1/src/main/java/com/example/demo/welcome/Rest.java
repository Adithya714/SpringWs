package com.example.demo.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
 public String name="Adithya";
 @GetMapping("/hello")
 public String display ()
 {
	 return "Welcome to restApi"+name;
 }
}
