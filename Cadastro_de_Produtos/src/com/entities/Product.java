package com.entities;

public class Product {
	//In this place, we write the atributes
	
	public String name;
	public double price;
	public int quantity;
	
	//In under, we write the methods
	//First method
	public double totalValueInStock() {
		return price * quantity;
	}
	//Second method
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	//Third method
	public void removeProducts(int quantity) {
		this.quantity -= quantity;		
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
	}
}