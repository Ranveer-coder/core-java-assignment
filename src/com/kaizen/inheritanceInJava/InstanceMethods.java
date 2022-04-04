package com.kaizen.inheritanceInJava;

public class InstanceMethods {
	
	static InstanceMethods d;
	
	public void bark() {
		System.out.println("Barking!!!!");
	}

	public static void main(String[] args) {
		
		 d = new InstanceMethods();
		 d.bark();

	}

}
