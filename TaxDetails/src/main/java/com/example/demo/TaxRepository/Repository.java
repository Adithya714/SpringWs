package com.example.demo.TaxRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Tax.Tax;
import com.example.demo.Tax.TaxerDetails;

import jakarta.transaction.Transactional;

public interface Repository extends JpaRepository<TaxerDetails, Integer> {
	
	@Query(value="select * from taxer where taxerid=:id",nativeQuery = true)
	public TaxerDetails getAll(@Param("id") int id);

	@Modifying
	@Transactional
	@Query(value="delete from taxer where taxerid=?1",nativeQuery = true)
	public void deletedetails(int id);
	
	@Modifying
	@Transactional
	@Query(value="update taxer set taxpercentage=?1 where taxerid=?2",nativeQuery = true)
	public void updateInfo( String per,int id);

	//jpql

	@Query("select s from TaxerDetails s where s.taxerincome=?1")
	public List<TaxerDetails> getByBal(String bal);
    
	@Modifying
	@Transactional
	@Query(value="update TaxerDetails s set s.paymentstatus=?1 where s.taxerid=?2")
	public void jpqUpdate(String pay, int id);

	@Modifying
	@Transactional
	@Query(value="delete from TaxerDetails s where s.taxerid=?1")
	public void jpqDelete(int id);
  
	@Query(value="select s from TaxerDetails s where s.taxerid between ?1 and ?2")
	public List<TaxerDetails> bet(int one, int two);
	
	@Query(value="select s from Tax s where taxername like 'A%'")
	public List<Tax> getLike();

}
