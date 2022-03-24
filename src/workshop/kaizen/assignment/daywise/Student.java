package workshop.kaizen.assignment.daywise;

public class Student {

	String name;
	double id;
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id =101;
		s1.name = "Ranveer";
		s2.id = 007;	
		s2.name = "Khokhar";
		
		System.out.println(s1.id+ " " + s1.name);
		System.out.println(s2.id+ " " + s2.name);
		
	}

}
