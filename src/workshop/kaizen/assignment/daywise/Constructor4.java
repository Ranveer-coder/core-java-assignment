package workshop.kaizen.assignment.daywise;

public class Constructor4 {

	String name;
	int id;
	int age;
	
	//three args constructor
	public Constructor4(String n, int i , int a){
		name = n;
		id = i;
		age = a;
	}
	
	void displayConstructor4() {
		System.out.println(name + " " + " " + id + " " +age);
	}
	
	public static void main(String[] args) {
		Constructor4 c1 = new Constructor4("Ranveer",777,23);
		c1.displayConstructor4();

	}

}
