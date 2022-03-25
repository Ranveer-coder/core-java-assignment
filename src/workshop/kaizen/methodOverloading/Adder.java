package workshop.kaizen.methodOverloading;

public class Adder {
		
	AdderOperation addCalculation;
	public int a;
	public int b;
	public int c;

	public int add(int a, int b) {
		addCalculation = new AdderOperation();
		int sum = addCalculation.add(a,b);
		return sum;
	
		}
	public float add(float a,float b) {
		
		addCalculation = new AdderOperation();
		float sum = addCalculation.add(a,b);
		return sum;
		
	}
	
public float add(float a,float b ,float c) {
		
		addCalculation = new AdderOperation();
		float sum = addCalculation.add(a,b,c);
		return sum;
		
	}
	
public double add(double a,double b ,double c) {
	
	addCalculation = new AdderOperation();
	double sum = addCalculation.add(a,b,c);
	return sum;
	
}

public double add(double a,double b) {
	
	addCalculation = new AdderOperation();
	double sum = addCalculation.add(a,b);
	return sum;
	
}

public int 	Multiply(int a,int b) {
	
	addCalculation = new AdderOperation();
	int sum = addCalculation.Multiply(a,b);
	return sum;
	
}

	public static void main(String[] args) {
		
		Adder ad = new Adder();
		System.out.println(ad.add(5, 7));
		Adder ad1 = new Adder();
		System.out.println(ad1.add(5, 5, 5));
		Adder ad2 = new Adder();
		System.out.println(ad2.add(5, 5, 5));
		Adder ad3 = new Adder();
		System.out.println(ad3.add(5, 5, 5));
		Adder ad4 = new Adder();
		System.out.println(ad4.add(5, 5, 5));
		Adder ad5 = new Adder();
		System.out.println(ad5.add(5, 5, 5));
	}
}
