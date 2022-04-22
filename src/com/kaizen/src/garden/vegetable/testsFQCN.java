package garden.vegetable;

public class testsFQCN {
    public static void main(String[] args) {
        //Fully qualified class name,so we dont have to use @import.
//String class in the java.lang inbuilt package...
        java.lang.String s = "We are testing ways to import classes!!!";
        System.out.println("String we imported by inbuilt packages = " +s);
//Any class in other packages must be qualified / imported.
        System.out.print("import from garden.vegetable Package: ");
        garden.vegetable.VineVegetable.main(args);

    }
}
