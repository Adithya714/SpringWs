package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Model;
import com.example.demo.Repository.Repo;


@Service
public class CricService {
	@Autowired
    public Repo rep;
	public Model postDetails( Model md) {
		
		return rep.save(md);
	}
	public void deleteDetails(int page)
	{
		 rep.deleteById(page);
	}
	public List<Model> sort(String pcountry) {
		
		return rep.findAll(Sort.by(pcountry).descending());
	}
	public List<Model> pagination(int num, int size) {
		Page<Model> p=rep.findAll(PageRequest.of(num, size));
		return p.getContent();
	}
 
}
