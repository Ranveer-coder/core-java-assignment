package com.kaizen.constructor;

public class Bike {

	int year;
	String name;
	String model;
	int gear;
	
	public Bike(int y,String n,String m,int g) {
		year = y;
		name = n;
		model = m;
		gear = g;
				
	}

	void display(){
		System.out.println(year +" " + name  + model + " " + gear);
	}
	
	
	public static void main(String[] args) {
		
		Bike b = new Bike(2022,"BMX"," Street",21);
		b.display();

	}

}
