package com.kaizen.controlstatement;

public class DoWhile {

	public static void main(String[] args) {
		int i = 0;
		
		while (i <= 10) {
			System.out.println("WHILE LOOP : " +i);
			i++;
		}
		
			int j = 0;
		//EXECUTES ATLEAST ONE TIME MANDATORY!
		do {
			System.out.println("DO-WHILE LOOP : " +j);
			//j++;
		}while(j != 0);
		
		System.out.println("End of loop");

	}

}
