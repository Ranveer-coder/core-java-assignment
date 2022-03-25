package com.kaizen.statickeyword;

import com.kaizen.constructor.Student;

public class Country {
	
	int id;
	String myCountryname;
	String continent;
	int countryCode;
	static String newCountry = "Russia";

	public Country(int i,String mc,String c,int cc,String nc) {
		id = i;
		myCountryname = mc;
		continent = c;
		countryCode = cc;
		newCountry = nc;
	}
	
	void displayCountry() {
		System.out.println(id+ " " + myCountryname + " " + continent + " " + countryCode + " " + newCountry );
	}
	
	public static void main(String[] args) {
		
		Country ukrain = new Country(1, " Ukrain", " Asia" , 9 , " Russia");
		Country dagesthan = new Country(000," Russia", " Eupore", 11, "CIS"); 
		ukrain.displayCountry();
		dagesthan.displayCountry();
		
		Country.newCountry = "Indian-Fedration";
		Country india = new Country(1, " Hindustan", " Asia" , 91 , "India");
		india.displayCountry();
		
		Student.study();

	}

}
