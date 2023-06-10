package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Login;
import com.example.demo.Service.LoginService;
@Repository
public interface LogRepo extends JpaRepository<Login,Integer> {

	Login findByemail(String email);

//	LoginService save(LoginService s);
	

}
