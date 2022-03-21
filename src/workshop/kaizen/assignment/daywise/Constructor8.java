package workshop.kaizen.assignment.daywise;

public class Constructor8 {

	Constructor8(){
		System.out.println("default");
	}
	Constructor8(int x){
		this();
		System.out.println(x);
	}
	Constructor8(int x , int y){
		this(5);
		System.out.println(x * y);
	}
	
	void display(int x,int y) {
		System.out.println(x*y);
	}
	
	
	public static void main(String[] args) {
		Constructor8 c = new Constructor8(8,15);
		c.display(10, 100);
	}

}
