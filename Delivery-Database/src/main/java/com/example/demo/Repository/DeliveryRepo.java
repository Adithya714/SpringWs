package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Delivery;

import jakarta.transaction.Transactional;

public interface DeliveryRepo extends JpaRepository<Delivery, Integer>{

	public List<Delivery> findByprice(String price);
	
	@Query(value="select * from details", nativeQuery= true)
	public List<Delivery> getAllData();
	
	@Query(value="select * from details where customerid=:id", nativeQuery= true)
	public List<Delivery> bycustomerid(@Param("id")int id);
	
	@Query(value="select * from details where customerid between :start and :end",nativeQuery= true)
	public List<Delivery> startend(@Param("start") int start ,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from details where customerid=?1 and customername=?2",nativeQuery= true)
	Integer deletebyId(@Param("id") int id,@Param("name") String name);

	@Modifying
	@Transactional
	@Query(value="update details set  customerid=:id where customername=:cname",nativeQuery= true)
	public void updateDelete(@Param("id") int id,@Param("cname") String cname);

	public Delivery findByloginname(String loginname);
	
	
	
}
