
package com.SenovaProject.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String discription;
	int categoryid;
	double weight;
	String dimensions;
	double price;
	int quantity;

	@Lob
	@Column(columnDefinition = "MEDIUMTEXT")
	private String imageurls;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImageurls() {
		return imageurls;
	}

	public void setImageurls(String imageurls) {
		this.imageurls = imageurls;
	}

	public Product(int id, String name, String discription, int categoryid, double weight, String dimensions,
			double price, int quantity, String imageurls) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
		this.categoryid = categoryid;
		this.weight = weight;
		this.dimensions = dimensions;
		this.price = price;
		this.quantity = quantity;
		this.imageurls = imageurls;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", discription=" + discription + ", categoryid=" + categoryid
				+ ", weight=" + weight + ", dimensions=" + dimensions + ", price=" + price + ", quantity=" + quantity
				+ ", imageurls=" + imageurls + "]";
	}

}
