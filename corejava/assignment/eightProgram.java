package com.kaizen.corejava.assignment;

import java.util.Scanner;

public class eightProgram {

	public static void main(String[] args) {
//		In the above program add an infinite loop to take input from the user
//		and print the corresponding month and the loop breaks if the user
//		enters 10. Hint infinite while loop.
		
		
		Scanner cs = new Scanner(System.in);
		
		while(true){
			
			System.out.println("Input Number Representation Of Months");
			
			int daysOfMonth = cs.nextInt();
			
			switch(daysOfMonth) {
			
			case 1:
				System.out.println("January");
				break;
			case 2 :
				System.out.println("Feb");
				break;
			case 3 :
				System.out.println("Mar");
				break;
			case 4:
				System.out.println("Apr");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7 :
				System.out.println("July");
				break;
			case 8 :
				System.out.println("Aug");
				break;
			case 9 :
				System.out.println("Sep");
				break;
			case 10:
				if(daysOfMonth == 10) {
				System.out.println("Oct");
				break;
				}
				
			case 11 :
				System.out.println("Nov");
				break;
			case 12 :
				System.out.println("Dec");
				break;
				
			default : System.out.println("INVALID VALUE!!!");	
			}
				
			}
			
			
		}


	}


