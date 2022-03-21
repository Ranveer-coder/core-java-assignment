package workshop.kaizen.assignment.daywise;

public class Car {
	
	String color;
	String company;
	String model;
	
	public Car() {
		System.out.println("Non-paramatrised Constructor!!!");
		System.out.println();
		System.out.println("Paramatrised Constructor : ");
	}
	
	public Car(String color, String company , String model) {
		
		this.color = color;
		this.company = company;
		this.model = model;
		
	}

	public static void main(String[] args) {

		Car cr = new Car();
		cr.color = "Purple";
		cr.company = "Lamborgini";
		cr.model = "AVENTADOR TOP-MODEL";
		
		cr.describeCar();
		
		Car mustang = new Car("Black" , " Ford " ,  "Shelby GT");
//		mustang.color = "Black";
//		mustang.company = "Ford";
//		mustang.model = "Shelby-GT Pro";
		
		mustang.describeCar();
		
		Car volkswagen = new Car("Black" , " Buggati " ,  "Chiron RS");
//		volkswagen.color = "Gold";
//		volkswagen.company = "Buggati";
//		volkswagen.model = "Chiron Racing Sport";
		
		volkswagen.describeCar();
		
	}
	public void describeCar() {
		System.out.println("Color : " + color + ", Company : " + company + ", Model : " + model);
	}

}
