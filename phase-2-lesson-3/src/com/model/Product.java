package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	//@GeneratedValue
	private String name;
	private String id;
	private String color;
	private String year;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String id, String color, String year) {
		super();
		this.name = name;
		this.id = id;
		this.color = color;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", color=" + color + ", year=" + year + "]";
	}
	
	
}
