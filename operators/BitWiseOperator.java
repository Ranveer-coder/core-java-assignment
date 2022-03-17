package com.kaizen.operators;

public class BitWiseOperator {
	
	public static void main(String[] args) {

	int a = 15;
	int b = 17;
	
	// OR OPERATOR
	System.out.println(a | b);
	// AND OPERATOR
	System.out.println(a & b);
	//XOR OPERATOR
	System.out.println(a ^ b);
	// BITWISE ~ COMPLIMENT OPERATOR
	System.out.println(~ b);
	System.out.println(~ a);
}
}