package workshop.kaizen.assignment.daywise;

public class Constructor3 {

	int id;
	String name;
	
	Constructor3(int id , String name){
		this.id = id;
		this.name = name;
	}
	
	void describeConstructor3(){
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {

		Constructor3 c1 = new Constructor3(222,"Ranveer");
		Constructor3 c2 = new Constructor3(555,"Khokhar");
		Constructor3 c3 = new Constructor3(777,"Anand");

		c1.describeConstructor3();
		c2.describeConstructor3();
		c3.describeConstructor3();
	}

}
