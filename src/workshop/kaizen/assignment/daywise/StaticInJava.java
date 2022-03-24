package workshop.kaizen.assignment.daywise;


//Main class for objects allocating.
public class StaticInJava {

	//instance variable can be used throughout class.
	String name;
	int rollNo;
	static String college = "Harvard";
	static int count = 0;
	
	//Static block //assign values of instance variable that are static.
	static{
		System.out.println(" is static");
		
	}
	//Parameterized Constructor.
	 StaticInJava(String n,int r) {
		
		this.name = n;
		this.rollNo = r;
		count++;
		
	}
	//Prints Variables by calling in display method both static and non static because this is a non static method.
	 public void display() {
		 System.out.println(rollNo);
		 System.out.println(college);
		 System.out.println(name);
	 }
	 //static method will only print static variable!
	 public static void show() {
		 System.out.println("in print");
		// System.out.println(name);
		 System.out.println(college);
	 }
	 
	public static void main(String[] args) {
		//creating objects for the class.
		
		StaticInJava sij = new StaticInJava("Ranveer",7);
		StaticInJava sij1 = new StaticInJava("Harshal",5);
		//Prints Public class non static.
		sij.display();
		sij1.display();
		System.out.println();
		//Main class name appends static college to print static variable.
		
		StaticInJava.college = "M.I.T - USA";
		//prints static variable.
		sij.display();
		System.out.println();
		sij1.display();
		System.out.println();
		
		StaticInJava.show();
		
	
		double d = Math.pow(3, 2);
		System.out.println(d);
	}

}
