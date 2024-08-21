package com.SenovaProject.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int userid;
	double price;
	Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", userid=" + userid + ", price=" + price + ", date=" + date + "]";
	}

	public Orders(int id, int userid, double price, Date date) {
		super();
		this.id = id;
		this.userid = userid;
		this.price = price;
		this.date = date;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

}
