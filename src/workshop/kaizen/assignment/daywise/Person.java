package workshop.kaizen.assignment.daywise;

public class Person {
	String name;
	int age;
	String city;;
	String gender;

	public Person() {
		System.out.println("Testing");
	}

	public Person(String name, int age, String city, String gender) {
		System.out.println("Testing2");
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;

	}

	public static void main(String[] args) {

		Person person = new Person();
		
		person.describePerson();
		
		person.name = "Ranveer";
		person.age = 23;
		person.city = "indore";
		person.gender = "male";
		
		person.describePerson();

		Person john = new Person("Jhon", 35, "Delhi", "male");
		john.describePerson();

	}

	public void eat() {
		System.out.println("eating");
	}

	public void study() {
		System.out.println("studying");
	}

	public void play() {
		System.out.println("playing");
	}

	public void sleep() {
		System.out.println("sleeping");
	}

	public void describePerson() {
		 System.out.println("Person [name=" + name + ", age=" + age + ", city=" + city + ", gender=" + gender + "]");
	}
	
	

}
