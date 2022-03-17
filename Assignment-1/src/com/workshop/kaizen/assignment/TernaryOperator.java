package com.workshop.kaizen.assignment;

public class TernaryOperator {

	public static void main(String[] args) {
		//SYNTAX --> variable = (condition) ? expression1(true) : expression2(false).  

		
		int x,y;
		x = 20;
		
		y = (x==1)?61:90;
		System.out.println(y);
		
		y = (x==20)?61:90;
		System.out.println(y);
		
		//a program that uses a ternary operator to print a message if
		//a particular integer is greater than 10 or less than equal to 10.
		
		int z = 7000; // 7
		int r = 1700; // 10
		int m;
		
		m = (z>10 | z<=10)?10:7;
		System.out.println(m);
		
		m = (r>10 | r<=10)?10:7;
		System.out.println(m);
	

		
	}

}
