package com.mongo.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
public class Product {
	@org.springframework.data.annotation.Id
	private String id;
	private String name;
	private String category;
	private int price;
	
	// Default Constructor
	public Product() {
		super();
	}
	// Parameterized Constructor
	public Product(String id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	// Getter and Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
}
