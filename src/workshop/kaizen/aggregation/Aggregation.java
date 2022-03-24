package workshop.kaizen.aggregation;

public class Aggregation {

	operation op;
	
	double circle(int c) {
		
		op = new operation();
		int sq = op.square(c);
		
		return Math.PI*sq;

	}
	
	public static void main(String[] args) {
		
		Aggregation ag = new Aggregation();		
		double area = ag.circle(45); 
		System.out.println(area);
//		System.out.println("Area of Circle " +ag.circle(45));
		
	}
}
