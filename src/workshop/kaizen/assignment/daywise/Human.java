package workshop.kaizen.assignment.daywise;

public class Human {

	String name;
	int dob;
	long number;
	String qualification;
	String occupation;
	String hobbies;
	
	public Human(String name, int dob, long number, String qualification, String occupations, String hobbies){
		this.name = name;
		this.dob = dob;
		this.number = number;
		this.qualification = qualification;
		this.occupation = occupation;
		this.hobbies = hobbies;
	}
	public Human() {
		System.out.println("Default");
	}
	
	public static void main(String[] args) {
		
		Human man = new Human();
		man.displayHuman();
		
		Human man1 = new Human("Ranveer",1998,7748848346l,"B.Tech","Software Engineer","Martial-Arts");
		man1.displayHuman();

	}
	
	void displayHuman() {
		System.out.println("Name : " + name + " dob : " + dob + " no : " + number + " degree " + qualification + " Job : " + occupation + " Hobbies : " + hobbies);
	}
	
}
