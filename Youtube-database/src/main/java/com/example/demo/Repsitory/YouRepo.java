package com.example.demo.Repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Youtube.Youtube;

public interface YouRepo extends JpaRepository<Youtube, Integer> {

}
