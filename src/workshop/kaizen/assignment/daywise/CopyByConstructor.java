<<<<<<< HEAD
package workshop.kaizen.assignment.daywise;

public class CopyByConstructor {
	
	int id;
	String name;
	
	public CopyByConstructor( String name,int id){
		this.id = id;
		this.name = name;
	}
	//Copy constructor by constructor.
	
	CopyByConstructor(CopyByConstructor c){
		id = c.id;
		name = c.name;
	}
	

	void describeCopy() {
		System.out.println(name + " " + id);
	}

	public static void main(String[] args) {
		CopyByConstructor c1 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c2 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c3 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c4 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c5 = new CopyByConstructor("Ranveer",7); 
		
		c1.describeCopy();
		c2.describeCopy();
		c3.describeCopy();
		c4.describeCopy();
		c5.describeCopy();
	}

}
=======
package workshop.kaizen.assignment.daywise;

public class CopyByConstructor {
	
	int id;
	String name;
	
	public CopyByConstructor( String name,int id){
		this.id = id;
		this.name = name;
	}
	//Copy constructor by constructor.
	
	CopyByConstructor(CopyByConstructor c){
		id = c.id;
		name = c.name;
	}
	

	void describeCopy() {
		System.out.println(name + " " + id);
	}

	public static void main(String[] args) {
		CopyByConstructor c1 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c2 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c3 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c4 = new CopyByConstructor("Ranveer",7); 
		CopyByConstructor c5 = new CopyByConstructor("Ranveer",7); 
		
		c1.describeCopy();
		c2.describeCopy();
		c3.describeCopy();
		c4.describeCopy();
		c5.describeCopy();
	}

}
>>>>>>> c0ded32e26dc4c56a47cb73ca617023f2a2406a9
