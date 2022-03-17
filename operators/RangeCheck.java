package com.kaizen.operators;

public class RangeCheck {

	public static void main(String[] args) {
		
		int i = 90000000;
		
		System.out.println(Math.multiplyExact(i, 4));
		
		
		// PRECIDENCE-CHECK(left to right & right to left)
		System.out.println(1 + 2 + "Hello!"); //Addition will be done then strings will print.
		System.out.println("Hello!" + 1 + 2); //String will maintain continuity!

	}

}
