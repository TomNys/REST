package edu.ap.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	
	private int id;
	private String name;
	private String brand;
	private String description;
	private double price;
	
	public Product(int id, String name, String brand, String description, double price ){
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
	}
	
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
}
