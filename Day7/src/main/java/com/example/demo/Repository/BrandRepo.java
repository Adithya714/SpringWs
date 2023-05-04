package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Brand;

import jakarta.transaction.Transactional;

public interface BrandRepo extends JpaRepository<Brand, Integer> {

	  @Query(value = "select * from marca",nativeQuery = true)
	  public List<Brand>  getAll();
	  
	  @Query(value="select * from product where productid=?1",nativeQuery= true)
	  public List<Brand> getById(@Param("id") int id);
	  
	  @Modifying
	  @Transactional
	  @Query(value="delete from poduct where productid=:id",nativeQuery = true)
	  Integer deleteById(@Param("id") int id);
    
	  @Modifying
	  @Transactional
	  @Query(value="update marca set productcolour=:colour where productsize=:size",nativeQuery = true)
	  public Brand updateDet(@Param("colour") Brand br,@Param("size") int id);
	   
	  
}
