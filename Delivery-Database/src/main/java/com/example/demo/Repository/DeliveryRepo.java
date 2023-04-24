package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Delivery;

public interface DeliveryRepo extends JpaRepository<Delivery, Integer>{

	public List<Delivery> findByprice(String price);

}
