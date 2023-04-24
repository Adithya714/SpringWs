package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Model;
import com.example.demo.Service.TrainService;
@RestController
public class TrainController {
      @Autowired
      public TrainService tserv;
      @PostMapping("/post")
      public Model saveInfo(@RequestBody Model mn)
      {
    	  return tserv.saveInfo(mn);
      }
      @GetMapping("/train")
      public List<Model> getInfo()
      {
    	  return tserv.getInfo();
      }
      
      @PutMapping("/put")
      public  Model updateDetails(@RequestBody Model mn)
      {
    	  return tserv.updateDetails(mn);
      }
      @DeleteMapping("/delete/{id}")
      public String deleteInfo(@PathVariable("id") int id)
      {
    	  tserv.deleteInfo(id);
    	  return "Train id "+id+"is Deleted";
      }
      @DeleteMapping("/deletebyreq")
      public String deleteIn(@RequestParam("id") int id)
      {
    	  tserv.deleteIn(id);
    	  return "Train id "+id+"is Deleted";
      }
}
