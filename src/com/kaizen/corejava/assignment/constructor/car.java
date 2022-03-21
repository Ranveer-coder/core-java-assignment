package com.kaizen.corejava.assignment.constructor;

public class car {
	
	String company;
	String model;
	String color;
	int year;
	int gear;
	
	public car(String company, String model, String color , int year , int gear) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.year = year;
		this.gear = gear;
	}

	public car() {
		System.out.println("DEFAULT");
	}

	public static void main(String[] args) {

		
		car cr = new car();
		
		cr.describeMyCar();
		
		car myCar = new car("Audi","r-8","black",2022,7);
		myCar.describeMyCar();
		car myCar1 = new car("benz","s-Class","black",2022,7);
		myCar1.describeMyCar();
		car myCar2 = new car("BMW","9 series","black",2022,7);
		myCar2.describeMyCar();
		car myCar3 = new car("Lambo","URUS","black",2022,7);
		myCar3.describeMyCar();
	}

	public void describeMyCar() {
		System.out.println(" " + company + " " + model + " " + color + " " + year + " " +gear);
	}
	
	
}
