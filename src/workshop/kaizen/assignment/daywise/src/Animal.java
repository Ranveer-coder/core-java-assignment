public class Animal {

    String name;
    String animalType;
    String animalChar;
    int trackId;
    int age;
    String lifeSpan;




    //Non-parametrised
    public Animal(){
        System.out.println("Default Constructor");
    }

    public Animal(String n, String aT, String aC, int tId, int age, String lS) {
        this.name = n;
        this.animalType = aT;
        this.animalChar = aC;
        this.trackId = tId;
        this.age = age;
        this.lifeSpan = lS;
    }

    public void displayAnimal(){
        System.out.println(" " +name + " " +animalType + " " +animalChar + " " + trackId + " " + age + " " + lifeSpan);
    }

    public static void main(String[] args) {

        Animal anim = new Animal();
        //prints null
        anim.displayAnimal();
        Animal tiger = new Animal("Tiger","Carnivore","HUNT&PREY",007,5,"Life Span From 12-14 years.");
        tiger.displayAnimal();

        Animal lion = new Animal("Lion","Carnivore","Rest,Eat,Rule",001,7,"years : 10-14");
        lion.displayAnimal();

        Animal cow = new Animal("Cow","Herbivore","Rest,Eat",002,8,"years : 10-14");
        cow.displayAnimal();

        Animal eagle = new Animal("Eagle","Bird","Fly,Explore",003,2,"years : 7");
        eagle.displayAnimal();

        Animal elephant = new Animal("Elephant","Herbivore","Rest,Eat,Rule",004,7,"years : 10-14");
        elephant.displayAnimal();

        Animal bear = new Animal("Bear","Omnivore","Rest,Eat",005,7,"years : 10-14");
        bear.displayAnimal();

        Animal shark = new Animal("Shark","FISH","swim",006,7,"years : 10-14");
        shark.displayAnimal();

    }


}
