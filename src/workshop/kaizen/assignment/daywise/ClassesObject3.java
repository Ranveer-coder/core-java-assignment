package workshop.kaizen.assignment.daywise;

public class ClassesObject3 { 
	    int id;  
	    String name;  
	    long salary;  
	    void insert(int i, String n, long sa) {  
	        id=i;  
	        name=n;  
	        salary=sa;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+salary);}  
 
	public static void main(String[] args) {  
		ClassesObject3 e1=new ClassesObject3();  
		ClassesObject3 e2=new ClassesObject3();  
		ClassesObject3 e3=new ClassesObject3();  
	    e1.insert(101,"Ranveer",450000000000000l);  
	    e2.insert(102,"Khokhar",250000000000000l);  
	    e3.insert(103,"Anand",5500000000000000000l);  
	    e1.display();  
	    e2.display();  
	    e3.display();  
	}  
	}  


