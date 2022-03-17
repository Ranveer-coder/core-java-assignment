package com.kaizen.io;

import java.util.Date;

public class DateTimeFormatting {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		
		//hours,minutes,seconds
		System.out.printf("Hours %tH : Minute %tM : Seconds %tS %n" ,date,date,date);
		System.out.println("\nOR\n");
		System.out.printf("%1$tH: %1$tM: %1$tS %1$tp %1$tL %1$tN %1$tz %n " ,date);
		System.out.println("");
		
		//day,month,year
		System.out.printf("Date(dd/mm/yyyy) = " + "%1$tm,%1$te,%1$tY %n" ,date);

		
		
		

	}

}
