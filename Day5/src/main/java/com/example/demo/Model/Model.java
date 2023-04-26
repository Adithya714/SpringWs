package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cricket")
public class Model {
	@Id
	private int page;
	private String pname;
	private String pcountry;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}

}
