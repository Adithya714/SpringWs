package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Model;
import com.example.demo.Service.CricService;

@RestController
public class Controller {
 @Autowired
 public CricService serv;
  @PostMapping("/post")
  public Model postDetails(@RequestBody Model md)
  {
	 return serv.postDetails(md);
  }
  @DeleteMapping("/delete/{page}")
  public String deleteDetails(@PathVariable("page") int page)
  {
	  serv.deleteDetails(page);
	  return "String id"+page+"is deleted";
  }
  @GetMapping("/sort/{pcountry}")
  public List<Model> sort(@PathVariable("pcountry") String pcountry)
  {
	  return serv.sort(pcountry);
  }
  @GetMapping("/pagination/{np}/{nm}")
  public List<Model> pagination(@PathVariable("np") int num,@PathVariable("nm") int size)
  {
	  return serv.pagination(num,size);
  }
  
  
}
