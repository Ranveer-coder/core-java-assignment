package com.workshop.kaizen.assignment;

public class SchoolManagementSystem {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO OUR SCHOOL MANAGEMENT DATABASE");
		
		System.out.println("AN OVERVIEW OF STUDENTS DATABASE : ");
		
		
		String name = "Student_Name";
		String fathersName = "Student_Father's_Name";
		String motherName = "Student_Mother's_Name";
		byte rollNo = 01;
		long fatherMobNumber = 94259_03269L;
		long studentMobNumber = 7748848346L;
		long aadharCard = 1234_5678_9113_1456L;
		short schoolarNo = 00001;
		int studentId = 0000000001;
		float feeDue = 350.50f;
		double feePaid = 35000.5000;
		char classSection = 'a';
		
		String studentDetails = "All Details of student including Address,PINCODE,DOB,Birth place and for more contact school";
	
		
		
		System.out.println(name);
		System.out.println(fathersName);
		System.out.println(motherName);
		System.out.println("Roll No. : " +rollNo);
		System.out.println("Father's Mobile :" +fatherMobNumber);
		System.out.println("Student Mobile no :" +studentMobNumber);
		System.out.println("A-Card number : " +aadharCard);
		System.out.println("Student no : " +schoolarNo);
		System.out.println("Student ID : " +studentId);
		System.out.println("Amount Due " +feeDue);
		System.out.println("Amount Paid " +feePaid);
		System.out.println("Section : " +classSection);
		boolean isStudentPresent; 
		if (isStudentPresent = true) {
			System.out.println("Student Present?");
		}else {
			System.out.println("Absent");
		}
		System.out.println("Present : " +isStudentPresent);
		System.out.println("ALL DETAILS HERE : " +studentDetails);
	
	}

}
