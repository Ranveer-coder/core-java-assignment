package com.kaizen.controlstatement;

public class ifElse {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
			if(a > b && a != b) {
			System.out.println("True : a is 30 & b is 20.");
			if(a < b || b != a) {
			System.out.println("True : b is 20.");
			}else if(a == b) {
			System.out.println("Equal");
			}else {
			System.out.println("False");
			}
		
			}

	}
}