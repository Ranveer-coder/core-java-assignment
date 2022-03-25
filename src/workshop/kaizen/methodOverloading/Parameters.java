package workshop.kaizen.methodOverloading;

public class Parameters {
	
	Number numb;
	public int Multiply(int a , int b) {
		
		numb = new Number();
		int sum = numb.Multiply(a, b);
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Parameters p = new Parameters();
		p.Multiply(5, 5);
		
		
	}

}
