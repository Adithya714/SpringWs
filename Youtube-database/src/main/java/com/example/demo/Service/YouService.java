package com.example.demo.Service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Youtube updatedetails(int id, Youtube yt) {
		// TODO Auto-generated method stub
	    Youtube obj=repo.findById(id).get();
	    if(Objects.nonNull(yt.getYname())&&!"".equalsIgnoreCase(yt.getYname()))
	    {
	    	obj.setYname(yt.getYname());
	    }
	    if(Objects.nonNull(yt.getYchname())&&!"".equalsIgnoreCase(yt.getYchname()))
	    {
	    	obj.setYchname(yt.getYchname());
	    }
	    if(Objects.nonNull(yt.getYid()))
	    {
	    	obj.setYid(yt.getYid());
	    }
	    if(Objects.nonNull(yt.getYsubcount())&&!"".equalsIgnoreCase(yt.getYsubcount()))
	    {
	    	obj.setYsubcount(yt.getYsubcount());
	    }
	    if(Objects.nonNull(yt.getYcontent())&&!"".equalsIgnoreCase(yt.getYcontent()))
	    {
	    	obj.setYname(yt.getYcontent());
	    }
	    
	    return repo.save(obj);
	}

}
