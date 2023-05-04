package com.example.demo.TaxController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TaxService;
import com.example.demo.Tax.Tax;
import com.example.demo.Tax.TaxerDetails;
import com.example.demo.TaxRepository.Repository;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Controller {
  @Autowired 
  public TaxService serv;
  @Autowired
  public Repository repo;
  
  @Tag(name="POSTING DETAILS",description = "posting details using save method")
  @PostMapping("/post")
  public TaxerDetails saveDet(@RequestBody TaxerDetails td)
  {
	  return serv.saveDet(td);
  }
  
  @Tag(name="DELETE IN MAIN CLASS",description = "deletion using id")
  @DeleteMapping("/delmain/{id}")
  public String mainDel(@PathVariable("panno") int id)
  {
	  serv.mainDel(id);
	  return "the give id is deleted";
  }
  
  
  @Tag(name="GET ALL DETAILS IN MAIN CLASS",description = "getting the details of all user's")
  @GetMapping("/getal")
  public List<TaxerDetails> getAllMain()
  {
	  return serv.getAllMain();
  }
  
  //query
  
  @Tag(name="GET DETAILS BY ID",description = "getting details of user using id")
  @GetMapping("/getbyid/{id}")
  public TaxerDetails getAll(@PathVariable("id") int id)
  {
	  return repo.getAll(id);
  }
  
  @Tag(name="DELETE USING TAXER ID",description = "delete user details using taxer id")
  @DeleteMapping("/deletejpql/{id}")
  public String deletedetails(@PathVariable("id")int id)
  {
	  repo.deletedetails(id);
	  return "Deleted successfully";
  }
  
  @Tag(name = "UPDATE PERCENTAGE USING ID",description = "updating tax percentage using taxer id")
  @PutMapping("/update/{per}/{id}")
  public String updateInfo(@PathVariable("per") String per,@PathVariable("id") int id)
  {
	  repo.updateInfo(per,id);
	  return "The given percentage is updated";
  }
  
  //jpql
  
  @Tag(name=" DELTE USING JPQL",description = "deleting user details using user's account balance")
  @GetMapping("/jpqldelete/{bal}")
  public List<TaxerDetails> getById(@PathVariable("bal") String bal)
  {
	  return repo.getByBal(bal);
  }
//
   @Tag(name="UPDATE USING JPQL",description="updating using taxer id") 
   @PutMapping("/jpqupdate/{pay}/{id}")
   public String jpqUpdate(@PathVariable("pay") String pay,@PathVariable("id") int id)
   {
	   repo.jpqUpdate(pay,id);
	   return "The payment status for the given id is updated";
   }
  
  @Tag(name="DELETE USING JPQL",description = "deleting using id")
  @DeleteMapping("/jpqdelete/{id}")
  public String jpqDelete(@PathVariable("id") int id)
  {
	  repo.jpqDelete(id);
	  return "The following Taxer's account is deleted";
  }
 
  @Tag(name="GET USING JPQL",description = "getting the details of user's using between")
  @GetMapping("/between/{one}/{two}")
  public List<TaxerDetails> bet(@PathVariable("one") int one,@PathVariable("two") int two)
  {
	  return repo.bet(one,two);
  }
  
  @Tag(name="GET USING LIKE IN JPQL",description = "getting the details of user using like")
  @GetMapping("/getlike")
  public List<Tax> getLike()
  {
	return repo.getLike();  
  }
}
