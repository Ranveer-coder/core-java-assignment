package com.kaizen.corejava.assignment;

import java.util.Locale;
import java.util.Scanner;

public class secondProgram {

	public static void main(String[] args) {
// 		Write a small console based interest calculation application that takes
//		loan amount(double), time(int) and interest(double) and rate from the
//		user and do calculation of the interest amount. Hint : (amount *
//		interest * duration)/100.
//		Ensure that precision of 2 decimal places is maintained while printing
//		and amount should properly formatted with “,” example, 10,000.25
//		Hint : use Locale.US
		
		
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter loan amount");
			double loanAmount = in.nextDouble();
			
			System.out.println("Enter Time");
			int time = in.nextInt();
			
			System.out.println("Enter Interest");
			double interest = in.nextDouble();
			
			System.out.println("Enter Rate");
			double rate = in.nextDouble();
			
			double interestAmount =  (loanAmount * interest * time)/100d;
			System.out.printf("Calculated Interest Amount = " +interestAmount);

			// declaring Local.US
			
		Locale usin = Locale.US ; 
		System.out.println("");
		
		//print locale
		System.out.println("US Locale = " +usin);
		//print language
		System.out.println("Language = " +usin.getDisplayLanguage());
		//print country
		System.out.println("Country origin = " +usin.getDisplayCountry(usin));
		//print hash-code
		System.out.println("Hash code = " +usin.hashCode());
		
		
		
		

	}

}
