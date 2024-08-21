
package com.SenovaProject.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int stars;
	int userid;
	int productid;
	Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Rating(int id, int stars, int userid, int productid, Date date) {
		super();
		this.id = id;
		this.stars = stars;
		this.userid = userid;
		this.productid = productid;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Rating [id=" + id + ", stars=" + stars + ", userid=" + userid + ", productid=" + productid + ", date="
				+ date + "]";
	}
	
}
