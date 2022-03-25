package workshop.kaizen.methodOverloading;

public class AdderOperation {
	

	
	public int add(float a , float b) {
		return (int) (a+b);
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public int add (int a, int b,int c) {
		return a+b+c;
	}
	
	public float add (float a,float b, float c) {
		return a+b+c;
	}
	
	public double add (double a, double b,double c) {
		return a+b+c;
	

}

	public int Multiply(int i,int j) {
		return i*j;
	}
}