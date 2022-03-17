package com.workshop.kaizen.assignment;

public class ifElseLadder {

//	enum weekDays{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
	
	public static void main(String[] args) {
		
//		weekDays d = weekDays.Monday;
//		weekDays d1 = weekDays.Tuesday;
//		weekDays d2 = weekDays.Wednesday;
//		weekDays d3 = weekDays.Thursday;
//		weekDays d4 = weekDays.Friday;
//		weekDays d5 = weekDays.Saturday;
//		weekDays d6 = weekDays.Sunday;
//		
//		System.out.println(d);
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
//		System.out.println(d4);
//		System.out.println(d5);
//		System.out.println(d6);
		
		
		//Days in a week presented by if-else ladder!
//		int DaysOfWeek = 5;
//		
//		if(DaysOfWeek == 1) {
//			System.out.println("Monday");
//		}else if(DaysOfWeek == 2) {
//			System.out.println("Tuesday");
//		}else if(DaysOfWeek == 3) {
//			System.out.println("Wednesday");
//		}else if(DaysOfWeek == 4) {
//			System.out.println("Thursday");
//		}else if(DaysOfWeek == 5) {
//			System.out.println("Friday");
//		}else if(DaysOfWeek == 6) {
//			System.out.println("Saturday");
//		}else {
//			System.out.println("HOLIDAY_SUNDAY");
//		}
//		
		
		//Doing Above Problem by SWITCH-CASE.
//		Syntax :
//		switch(expression) {
//		  case x:
//		    // code block
//		    break;
//		  case y:
//		    // code block
//		    break;
//		  default:
//		    // code block
//		}
		
		int weekDays = 6;
		
		switch(weekDays) {
		case 1 :
			System.out.println("Monday");
			break;
			
		case 2 :
			System.out.println("Tuesday");
			break;
			
		case 3 :
			System.out.println("Wed");
			break;
		
		case 4 :
			System.out.println("Thurs");
			break;
			
		case 5 :
			System.out.println("Fri");
			break;
		case 6 :
			System.out.println("Sat");
			break;
			
		case 7 :
			System.out.println("SUNDAY_HOLIDAY");
			break;
			
			
		default:
			System.out.println("INVALID DAY!!!");
		}
		
		
			

	}

}
