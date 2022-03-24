package com.kaizen.constructor;

public class Employee {
		
	String name;
	long salary;
	
	public Employee() {} // default constructor.
	
	public Employee(String n,long s) {
		name = n;
		salary = s;
	}
	
	void print() {
		System.out.println(name + " " + salary);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Ranveer",30000000000000000l);
		e.print();
		
	}

}
