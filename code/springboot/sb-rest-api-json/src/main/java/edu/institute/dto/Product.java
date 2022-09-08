package edu.institute.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	private int id;
	
	@NotBlank(message = "Name Must not be blank")
	@Pattern(regexp = "[A-Za-z]*", message = "Invalid Name, Name must contains only char")
	@Size(min = 3, max=10, message = "Name Must contains min 3-10 char")
	private String name;
	
	private double price;
	private int qty;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
