package com.kaizen.CodingExercises.Inheritance;

public class CarpetCost {
	public static void main(String[] args) {
		
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("First Carpet Cost = " + calculator.getTotalCost());
		
		carpet = new Carpet(1.5);
		floor = new Floor(5.4d, 4.5d);
		calculator = new Calculator(floor, carpet);
		System.out.println("Second Carpet Cost = " + calculator.getTotalCost());
		
		
	}

}
