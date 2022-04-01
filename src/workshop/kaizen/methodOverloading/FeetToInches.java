package workshop.kaizen.methodOverloading;

public class FeetToInches {

	public static void main(String[] args) {

			
		double length = calcFeetAndInchesToCentimeters(5, 10);
		System.out.println(length);
		length = calcFeetAndInchesToCentimeters(6, 0);
		System.out.println(length);
		length = calcFeetAndInchesToCentimeters(6, 10);
		System.out.println(length);
		length = calcFeetAndInchesToCentimeters(10, 13);
		System.out.println(length);
		length = calcFeetAndInchesToCentimeters(13, 20);
		System.out.println(length);
		
		
		calcFeetAndInchesToCentimeters(12);
		calcFeetAndInchesToCentimeters(7);
		calcFeetAndInchesToCentimeters(6);
		calcFeetAndInchesToCentimeters(7);
		calcFeetAndInchesToCentimeters(8.5);
		
		
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet , double inches) {
		
		if((feet < 0 ) || (inches < 0 ) && (inches >= 12)) {
			return -1;
		}
		
		double centimeter = (feet*12)*2.54;
		centimeter = centimeter + inches * 2.54;
		System.out.println(feet+ " " + inches + " " + centimeter + " cm" );
		return centimeter;
	}
		
		public static double calcFeetAndInchesToCentimeters(double inches) {
			
			if(inches < 0 ) {
				return -1;
			}
			
			double feet = inches/12.7;
			double remInches = inches % 12.7;
			System.out.println(inches+ " inch " + feet + " feet " + remInches + " remaining inches ");
			return calcFeetAndInchesToCentimeters(feet,inches);
		}
	
		
		
	}
	

