package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.person.JasonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day2Application.class, args);
		JasonIgnore jas=new JasonIgnore(1,"Adithya", 18);
		ObjectMapper obj=new ObjectMapper();
		String ign=obj.writeValueAsString(jas);
		System.out.println(ign);
	}

}
