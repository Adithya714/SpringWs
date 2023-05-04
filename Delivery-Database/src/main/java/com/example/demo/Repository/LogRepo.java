package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Login;

public interface LogRepo extends JpaRepository<Login, Integer> {
	
	public Login findByloginname(String loginname);
}
