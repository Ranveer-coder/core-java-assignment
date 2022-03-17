package com.kaizen.io;

import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {

		Date date = new Date();
		
		//t for data and T for time part of date
		System.out.printf("%tT%n", date);
		// hours,minutes,seconds
		System.out.printf("Hours %tH : Minutes %tM Seconds %tS%n" ,date,date,date);
		// index reference of the parameter $1 in this case
		System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n",date);
		//day month year
		System.out.printf("%1$tA:%1$tm:%1$tY",date);
		
		

		
		
	}

}
