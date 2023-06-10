package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adithya")
public class Modell {
  @Id
  private int lap_id;
  private String lap_name;
  private String lap_price;
  
  public int getLap_id() {
	return lap_id;
}
public void setLap_id(int lap_id) {
	this.lap_id = lap_id;
}
public String getLap_name() {
	return lap_name;
}
public void setLap_name(String lap_name) {
	this.lap_name = lap_name;
}
public String getLap_price() {
	return lap_price;
}
public void setLap_price(String lap_price) {
	this.lap_price = lap_price;
}
  
}
