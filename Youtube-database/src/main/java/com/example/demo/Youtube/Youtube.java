package com.example.demo.Youtube;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tubedetails")
public class Youtube {
   @Id
   @Column(name="Youtube Id")
   private int Yid;
   @Column(name="Channel Name")
   private String Ychname;
   private String Yname;
   private String Ysubcount;
   private String Ycontent;
   
	public int getYid() {
		return Yid;
	}
	public void setYid(int yid) {
		Yid = yid;
	}
	public String getYchname() {
		return Ychname;
	}
	public void setYchname(String ychname) {
		Ychname = ychname;
	}
	public String getYname() {
		return Yname;
	}
	public void setYname(String yname) {
		Yname = yname;
	}
	public String getYsubcount() {
		return Ysubcount;
	}
	public void setYsubcount(String ysubcount) {
		Ysubcount = ysubcount;
	}
	public String getYcontent() {
		return Ycontent;
	}
	public void setYcontent(String ycontent) {
		Ycontent = ycontent;
	}
}


