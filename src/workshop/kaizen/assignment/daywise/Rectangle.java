package workshop.kaizen.assignment.daywise;

public class Rectangle {

	int length;
	double width;
	
	void insert(int l , double w){
		
		length = l;
		width = w;
	}
	
	void calculateArea() {
		System.out.println(length*width);
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.insert(5,10);
		r.calculateArea();

	}

}
