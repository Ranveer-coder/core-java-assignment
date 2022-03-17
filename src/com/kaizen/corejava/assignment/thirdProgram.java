package com.kaizen.corejava.assignment;

import java.util.Date;

public class thirdProgram {

	public static void main(String[] args) {

//		Print the current date in the below formats
//		● 06:39:06 am 871 871000000 +0530 Monday, March 2022
//		● 06:39:06 am 871 871000000 +0530 Monday, Monday, 14 22
//		● hours 06: minutes 50: seconds 14.
		
		Date d = new Date();
		
		System.out.printf("%1$tH : %1$tM : %1$tS %1$tp  %1$tL %1$tN %1$tz %1$tA %1$tD  %n" ,d);
		System.out.printf("%1$tH : %1$tM : %1$tS %1$tp  %1$tL %1$tN %1$tz %1$tA %1$tm %1$td %1$ty %n" ,d);
		System.out.printf("Hours H : %tH, Minutes M : %tM, Second S : %tS %n" ,d,d,d);
		
		
	}

}
