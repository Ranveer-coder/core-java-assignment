package com.kaizen.inheritanceInJava;

public class Phone extends Product {

	public Phone() {
	super(2012, "Xaiomi");	
	}
	
	@Override
	public void productFunction() {
		productFunction();
		ring();
		System.out.println("Phone.ring() called");
	}
	
	@Override
	public Product[] listOfVariants() {
		throw new UnsupportedOperationException();	
	}
	
	public int calculateAmountOfVariants() {
		return super.listOfVariants().length;
	}

	public void ring() {
		System.out.println("Ringing");
		
	}
	
}
