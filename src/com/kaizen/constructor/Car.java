package com.kaizen.constructor;

public class Car {

	String name;
	int model;
	int gear;
	float topSpeed;
	
	public Car() {}
	
	public Car(String n,int i,int g,float ts) {
		
		name = n;
		model = i;
		gear = g;
		topSpeed = ts;
		
	}
	
	void print() {
		System.out.println(name + " " + model + " " + gear + " " + topSpeed  );
	}
	
	public static void main(String[] args) {
		
		Car c = new Car("Ferrari",007,7,425);
		c.print();

	}

}
