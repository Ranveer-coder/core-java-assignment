package workshop.kaizen.assignment.daywise;

import java.util.Scanner;

public class ClassesObject2 {
	
		String name;
		int rollno;
		long MobNo;
		String Adhar;
		String schoolName;
		String FatherName;
		String Nation;
		String Class;
		Scanner scan = new Scanner(System.in);
		private int id = scan.nextInt();;
	

	
	public static void main(String[] args) {
		System.out.println("Database : " );
		System.out.println("Enter I.D. : ");
		
		
		
		ClassesObject2 s1 = new ClassesObject2();
		s1.name="Ranveer Anand";
		s1.id  = 7;
		s1.rollno = 999999999;
		s1.MobNo = 7748848346l;
		s1.Adhar = "0000_0000_0000_0000";
		s1.schoolName = "S.H.S.S.";
		s1.FatherName = "MR.Chandan Anand";
		s1.Nation = "INDIA";
		s1.Class = "JAVA";
		
		System.out.println("INFO : " +s1.name + "\n" +s1.id+ "\n" +s1.rollno+ "\n" +s1.MobNo+ "\n" +s1.Adhar+ "\n" +s1.schoolName+ "\n" +s1.FatherName+ "\n" +s1.Nation+ "\n" +s1.Class);
		
	}
	}

