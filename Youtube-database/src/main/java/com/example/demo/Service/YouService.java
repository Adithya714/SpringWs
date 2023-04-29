package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repsitory.YouRepo;
import com.example.demo.Youtube.Youtube;
@Service
public class YouService {
	@Autowired
	public YouRepo repo;

	public Youtube savedetails(Youtube yt) {
		// TODO Auto-generated method stub
		return repo.save(yt);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	public Optional<Youtube> getdetails(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public List<Youtube> sortDet(String yname) {
		return repo.findAll(Sort.by(yname).ascending());
	}

	public List<Youtube> paginate(int pg, int num) 
	{
		Page<Youtube> obj=repo.findAll(PageRequest.of(pg, num));
		return obj.getContent();
	}

	public Youtube updatedetails(int id, Youtube yt) {
	           
		return null;
	}

}
