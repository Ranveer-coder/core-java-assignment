package workshop.kaizen.assignment.daywise;

import java.util.Scanner;

public class Constructor1 {
		
	int id;
	String name;
	
	void show() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter ID : ");
		int id = sc.nextInt();
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
			
		//objects
		Constructor1 s1 = new Constructor1();
		Constructor1 s2 = new Constructor1();
		//print
		s1.show();
		s2.show();
		

	}

}
