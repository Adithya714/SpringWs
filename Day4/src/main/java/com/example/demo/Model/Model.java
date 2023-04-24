package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tdetails")
public class Model {
	@Id
    private int train_id;
    private String train_name;
    private String train_path;
    
    
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getTrain_path() {
		return train_path;
	}
	public void setTrain_path(String train_path) {
		this.train_path = train_path;
	}
    
}
