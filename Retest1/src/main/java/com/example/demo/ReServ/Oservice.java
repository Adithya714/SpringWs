package com.example.demo.ReServ;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Modell;
import com.example.demo.ReRepo.Repo;

@Service
public class Oservice {

  @Autowired
  public Repo re;
  
public Modell SaveInfo(Modell mn) 
{	
	return re.save(mn);
}

public List getDet() {
	
	return re.sa;
}

public List getAll() 
{	
	return re.findAll();
}


}
