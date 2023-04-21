package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.example.Example;

public interface ExampleRepo extends JpaRepository<Example,Integer> {

}
