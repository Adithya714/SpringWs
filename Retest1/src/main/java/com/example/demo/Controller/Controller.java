package com.example.demo.Controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Modell;
import com.example.demo.ReServ.Oservice;

@RestController
public class Controller {
  @Autowired
  public Oservice serv;
  
  @PostMapping("/put")
  public Modell SaveInfo(@RequestBody Modell mn)
  {
	  return serv.SaveInfo(mn);
  }
  @GetMapping("/get")
  public List<Modell> getAll()
  {
	  return serv.getAll();
  }
  
}
