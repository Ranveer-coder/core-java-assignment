package com.kaizen.CodingExercises.Inheritance;

public class Person {

	String firstName;
	String lastName;
	int age;
	private String fullName;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int setAge(int a) {
		this.age = a;
		if(age < 0 && age > 100) {
			return 0;
		}
		return a;
	}
	
	public boolean isTeen(int age) {
		if(age > 12 && age < 21) {
			return true;
		}
		return false;
	}
	
	public String getFullName(String fn) {
		
		fullName = fn;
		return fullName = firstName+lastName;
	}
	
	
	
	public static void main(String[] args) {
	
		Person p = new Person();
		p.setFirstName(" ");
		p.setLastName(" ");
		p.setAge(23);
		System.out.println("Full name = " + p.getFullName("User_Full_Name"));
		System.out.println("Teen = " +p.isTeen(16));
		p.setFirstName("Ranveer");
		p.setLastName(" Khokhar");
		System.out.println("Full name = " +p.getFullName("Ranveer Khokhar Anand"));
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

}
