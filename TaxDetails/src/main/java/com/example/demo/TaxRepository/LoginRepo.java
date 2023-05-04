package com.example.demo.TaxRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Tax.Login;

public interface LoginRepo extends JpaRepository<Login, Integer>
{

}
