package com.kaizen.inheritanceInJava;

public class LionInstance {
	
	private String name;
	
	public void Lion(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Name = " +name);
	}
	
	public static void main(String[] args) {
		
	Lion lion = new Lion("Sher");	
	lion.printName();
	Lion l = new Lion("Big cat");
	l.printName();
		

	}

}
