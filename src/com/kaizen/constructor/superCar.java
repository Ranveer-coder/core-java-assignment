package com.kaizen.constructor;

public class superCar {
	
	String color;
	String company;
	String model;
	
	public superCar() {
		System.out.println("Non-paramatrised Constructor!!!");
		System.out.println();
		System.out.println("Paramatrised Constructor : ");
	}
	
	public superCar(String color, String company , String model) {
		
		this.color = color;
		this.company = company;
		this.model = model;
		
	}

	public static void main(String[] args) {

		superCar cr = new superCar();
		cr.color = "Purple";
		cr.company = "Lamborgini";
		cr.model = "AVENTADOR TOP-MODEL";
		
		cr.describeCar();
		
		superCar mustang = new superCar("Black" , " Ford " ,  "Shelby GT");
//		mustang.color = "Black";
//		mustang.company = "Ford";
//		mustang.model = "Shelby-GT Pro";
		
		mustang.describeCar();
		
		superCar volkswagen = new superCar("Black" , " Buggati " ,  "Chiron RS");
//		volkswagen.color = "Gold";
//		volkswagen.company = "Buggati";
//		volkswagen.model = "Chiron Racing Sport";
		
		volkswagen.describeCar();
		
	}
	public void describeCar() {
		System.out.println("Color : " + color + ", Company : " + company + ", Model : " + model);
	}

}
