package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.YouService;
import com.example.demo.Youtube.Youtube;

@RestController
public class YouControll {
	@Autowired
  public YouService yserv;
  
  @PostMapping("/youtube")
  public Youtube savedetails(@RequestBody Youtube yt)
  {
	  return yserv.savedetails(yt);
  }
  @DeleteMapping("/youtube/{id}")
  public String deletedetails(@PathVariable("id") int id)
  {
	  yserv.deletedetails(id);
	  return "deletion was Succesfull";
  }
  @GetMapping("/youtube/{id}")
  public Optional<Youtube> getdetails(@PathVariable("id")int id)
  {
	  return yserv.getdetails(id);
  }
  
  @PutMapping("/youtube/{id}")
  public Youtube updatedetails(@PathVariable("id")int id,@RequestBody Youtube yt)
  {
	return yserv.updatedetails(id,yt);  
  }
  @GetMapping("/sort/{yname}")
  public List<Youtube> sortDet(@PathVariable("yname") String yname)
  {
	  return yserv.sortDet(yname);
  }
  @GetMapping("/paginate/{pg}/{num}")
  public List<Youtube> paginate(@PathVariable("pg") int pg,@PathVariable("num") int num)
  {
	  return yserv.paginate(pg,num);
  }
  
}

