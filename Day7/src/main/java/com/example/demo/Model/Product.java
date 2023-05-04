package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	 @Id
	 private String productid;
	 private String productcolour;
	 private String productsize;
	 
	 public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductcolour() {
		return productcolour;
	}
	public void setProductcolour(String productcolour) {
		this.productcolour = productcolour;
	}
	public String getProductsize() {
		return productsize;
	}
	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}
}
