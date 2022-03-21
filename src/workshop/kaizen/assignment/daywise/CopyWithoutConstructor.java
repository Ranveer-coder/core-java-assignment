package workshop.kaizen.assignment.daywise;

public class CopyWithoutConstructor {
		
	int id;
	String name;
	
	public CopyWithoutConstructor(int id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
    CopyWithoutConstructor(){
		
	}
	

	void describeCopy1() {
		System.out.println(name + " " + id);
	}
	
	public static void main(String[] args) {
		
		CopyWithoutConstructor c = new CopyWithoutConstructor(7,"ranveer");
		CopyWithoutConstructor c1 = new CopyWithoutConstructor();
		
		c1.id = c.id;
		c1.name = c.name;
		
		c.describeCopy1();
		c1.describeCopy1();
	}

}
