package com.workshop.kaizen.assignment;

public class ifStatement {

	public static void main(String[] args) {
		
		int i = 127;
		int i1 = 7;
		// OR -------> int i = 12;
		String s = "String Printed i.e Program Successful!";
		
		if(i > 20) {
			if(i1 >= 0 || i1 <= 0) {
				System.out.println("TRUE : VALUE GIVEN EXISTS B/W 0 TO 10,Int Value = " +i1);
			}
			System.out.println("I is Greater than 20 so, " +s);
		}else if(i < 20) {
			System.out.println("Number Less than 20!!!");
		}else System.out.println("INVALID NUMBER/CASE!!!");

	}

}
