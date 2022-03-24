package com.kaizen.constructor;

public class EmployeeNew {

	String name;
	int id;
	long mobileNo;
	
	void insert(String n,int i,long m) {
		
		name = n;
		id = i;
		mobileNo = m;
		
	}
	
	public static void main(String[] args) {
		
		EmployeeNew e = new EmployeeNew();
		EmployeeNew e1 = new EmployeeNew();
		EmployeeNew e2 = new EmployeeNew();
		
		e.insert("Ranveer", 7, 7748848346l);
		e1.insert("r", 10, 10l);
		e2.insert("a", 10, 10);
		
		System.out.println("Employee Information : ");
		System.out.println("Name : " +e.name + " ID : " + e.id + " Mobile Number : " + e.mobileNo);
		System.out.println(e1.name + " " + e1.id + " " + e1.mobileNo);
		System.out.println(e2.name+ " "+ e2.id + " " +e2.mobileNo );

	}
}
