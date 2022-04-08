package com.kaizen.inheritanceInJava;

public class Product {
	
	private double mfd;
	private String name;
		
	public Product(double m, String n) {
		this.mfd = m;
		this.name = n;
	}
	
	public int calculateInventory() {
		return 70000;
	}
	
	public void setMfd(double mfd) {
		this.mfd = mfd;
	}
	
	public double getMfd() {
		return this.mfd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Product[] listOfVariants() {
		return new Product[3];
	}
	
	public void productFunction() {
		System.out.println("Functions of product : ");
	}
	

}
