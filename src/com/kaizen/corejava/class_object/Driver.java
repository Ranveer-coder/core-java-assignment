package com.kaizen.corejava.class_object;

public class Driver {

	public static void main(String[] args) {
		
		Number n = new Number();
		n.setFirstNumber(77.77d);
		n.setsecondNumber(10);
		System.out.println(n.getFirstNumber());
		System.out.println(n.getsecondNumber());
		

		Number calculator = new Number();
		calculator.setFirstNumber(5.0);
		calculator.setsecondNumber(4);
		System.out.println(calculator.getFirstNumber());
		System.out.println(calculator.getsecondNumber());
		
	}

}
