package com.kaizen.corejava.assignment;

import java.util.Date;

public class sixthProgram {

	public static void main(String[] args) {

//		Find the number of minutes from the mid-night today to now and print
//		them. The result should be different every time you run it. Hint : use
//		date.getHours() to get the number of hours and date.getMinutes() to
//		get the number of minutes.
		
		
		Date dt = new Date();
		
		Date d = dt;
		System.out.println("Number of minutes from the mid-night today till now : " + " Hours = "+ d.getHours() + ", Minutes = " +d.getMinutes());

		
	}

}
