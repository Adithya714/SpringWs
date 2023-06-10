package com.example.demo.ReRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Modell;

public interface Repo extends JpaRepository<Modell, Integer>
{
       
}
