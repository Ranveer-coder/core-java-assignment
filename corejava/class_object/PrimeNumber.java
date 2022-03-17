package com.kaizen.corejava.class_object;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n = scan.nextInt();
		
			
		if(isPrime(n)) {
			System.out.println(n+ " prime");
		}else System.out.println(n+ " not prime");
	
			
		}
		}
	
		public static boolean isPrime(int n) {
			
			if(n<=1) {
				return false;
			}else if(n % 2 == 0 && n <= 1) {
				return false;	
			}

			for(int i = 2 ;  i <= Math.sqrt(n) ; i++) {
				if(n % i == 0)
				return false;
			}
			return true;
		}
		
		
		
	}


