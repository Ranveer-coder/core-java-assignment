package com.kaizen.controlstatement;

enum weekDay {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}

public class SwitchCase {

	public static void main(String[] args) {
          int days = 1; 
		//weekDay days = weekDay.MONDAY;
		
		
		
		switch(days) {
		
		case 1 : 
			System.out.println("Monday");
			break;
		case 2 :
		System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("WED");
				break;
		case 4 :
			System.out.println("THURS");
				break;
		case 5 :
			System.out.println("FRI");
				break;
		case 6 :
			System.out.println("SAT");
				break;
		case 7 :
			System.out.println("SUN");
				break;
		
				default :
					System.out.println("Not a valid value");
		
		
		
		}
		
		 	

	}

}
