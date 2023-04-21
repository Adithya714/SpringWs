package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carmodel")
public class CarModel {
	@Id
	@Column(name="car id")
            private int cid;
	@Column(name="car name")
            private String cname;
	@Column(name="car model")
            private String cmodel;
            
			public int getCid() {
				return cid;
			}
			public void setCid(int cid) {
				this.cid = cid;
			}
			public String getCname() {
				return cname;
			}
			public void setCname(String cname) {
				this.cname = cname;
			}
			public String getCmodel() {
				return cmodel;
			}
			public void setCmodel(String cmodel) {
				this.cmodel = cmodel;
			}
            
}
