package com.kaizen.inheritanceInJava;

public class ProductMain {

	public static void main(String[] args) {
	
		Product product = new Product(04.2022, "Mi India.");
		product.setName("POCO-X3");
		product.setMfd(04.2022);
		product.productFunction();
		System.out.println("Product name : " +product.getName());
		System.out.println("Product manufacturing : " +product.getMfd());
		System.out.println("Stock in inventory : " +product.calculateInventory());
		
		//product.ring(); // will give error because object of Product() is not instanceof Phone()
		
		Phone phone = new Phone();
		phone.ring();
		//making Product()'s object instance of Phone() to call methods from it.
		if (product instanceof Phone) {
			
			Phone phone1 =  (Phone)product;
			product.productFunction();
			phone1.ring();
		}
		System.out.println("Amount of Variants : " +phone.calculateAmountOfVariants());
		
	}

}
