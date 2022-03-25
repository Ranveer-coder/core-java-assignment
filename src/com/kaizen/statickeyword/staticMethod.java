package com.kaizen.statickeyword;

import java.util.Date;

import com.kaizen.constructor.Student;

public class staticMethod {
	
	int id;
	static String myCountryname;
	String continent;
	int countryCode;
	static String newCountry = "Russia";

	static String countryChange() {
		return myCountryname = "INDIA-AKHAND-BHARAT";
	}
	
	public staticMethod(int i,String mc,String c,int cc,String nc) {
		id = i;
		myCountryname = mc;
		continent = c;
		countryCode = cc;
		newCountry = nc;
	
	}
	
	void displayCountry() {
		System.out.println(id+ " " + myCountryname + " " + continent + " " + countryCode + " " + newCountry);
	}
	
	public static void main(String[] args) {

		newCountry = staticMethod.countryChange();
	
		staticMethod ukrain = new staticMethod(1, " Ukrain", " Asia" , 9 , " Russia");
		staticMethod dagesthan = new staticMethod(000," Russia", " Eupore", 11, "CIS"); 
		ukrain.displayCountry();
		dagesthan.displayCountry();
		
		staticMethod.newCountry = "Indian-Fedration";
		staticMethod india = new staticMethod(1, " Hindustan", " Asia" , 91 , "India");
		india.displayCountry();
		
		Date d = new Date();
		System.out.printf("%1$tH: %1$tM: %1$tS %1$tp %1$tL %1$tN %1$tz %n " ,d);
		System.out.println("");
		
		
		Student.study();

	}

}

