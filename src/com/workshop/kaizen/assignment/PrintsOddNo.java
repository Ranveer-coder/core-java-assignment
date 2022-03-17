package com.workshop.kaizen.assignment;

public class PrintsOddNo {

	public static void main(String[] args) {

		
		int i;
		for(i = 1 ; i <= 99 ; i++ ) {
			//if even no's remainder is not equal to 0 then it will print odd
			if(i%2 != 0) {
				System.out.println("Odd numbers : " +i);
				continue;
			}
			
		}
			
	}

}
