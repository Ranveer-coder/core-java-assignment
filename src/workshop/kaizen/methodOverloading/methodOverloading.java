package workshop.kaizen.methodOverloading;

public class methodOverloading {
	
	AggregationMethodOverloading calculation;
	
	int Aggregating(int a,int b){
		calculation = new AggregationMethodOverloading();
		int add = calculation.sum(a,b);
		return add;	
	}
	double Aggregating(double a,double b){
		calculation = new AggregationMethodOverloading();
		double divide = calculation.sum(a, b);
		return divide;	
	}
	float Aggregating(float a,float b){
		calculation = new AggregationMethodOverloading();
		float multiply = calculation.sum(a, b);
		return multiply;	
}

	public static void main(String[] args) {
		
		methodOverloading m1 =new methodOverloading();
		System.out.println(m1.Aggregating(5,7));
		methodOverloading m2 = new methodOverloading();
		System.out.println(m2.Aggregating(10000.00000, 1000.000));
		methodOverloading m3 = new methodOverloading();
		System.out.println(m3.Aggregating(7000.000, 700.00));
		
		
	}
	
}
