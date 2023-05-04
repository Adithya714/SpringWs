package com.example.demo.Tax;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="taxer")
public class TaxerDetails {
   @Id
   private int taxerid;
   private String taxeraccount;
   private String taxerbalance;
   private String taxerincome;
   private String taxpercentage;
   private String panno;
   private String paymentstatus;
   
   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn
   private List<Tax> additional;
   
   public List<Tax> getAdditional() {
	return additional;
}
public void setAdditional(List<Tax> additional) {
	this.additional = additional;
}
public String getPaymentstatus() {
	return paymentstatus;
}
public void setPaymentstatus(String paymentstatus) {
	this.paymentstatus = paymentstatus;
}
   
public int getTaxerid() {
	return taxerid;
}
public void setTaxerid(int taxerid) {
	this.taxerid = taxerid;
}
public String getTaxeraccount() {
	return taxeraccount;
}
public void setTaxeraccount(String taxeraccount) {
	this.taxeraccount = taxeraccount;
}
public String getTaxerbalance() {
	return taxerbalance;
}
public void setTaxerbalance(String taxerbalance) {
	this.taxerbalance = taxerbalance;
}
public String getTaxerincome() {
	return taxerincome;
}
public void setTaxerincome(String taxerincome) {
	this.taxerincome = taxerincome;
}
public String getTaxpercentage() {
	return taxpercentage;
}
public void setTaxpercentage(String taxpercentage) {
	this.taxpercentage = taxpercentage;
}
public String getPanno() {
	return panno;
}
public void setPanno(String panno) {
	this.panno = panno;
}


}
