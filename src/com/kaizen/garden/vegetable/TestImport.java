package garden.vegetable;
import garden.vegetable.*;
import nursery.vegetable.*;
public class TestImport {
    public static void main(String[] args) {

        //String class in java.lang Package, simple class name,specified location from testsFQNC string class.
        Class<String> s = String.class;
        String s1 = "We are testing the imports";
        System.out.println("String Class Name = " +s);
        System.out.println(s1);

        //ArrayList class in java.util Package,used simple class name, no imports required.
        Class c =java.util.ArrayList.class;
        String className = c.getName();
        System.out.println("ArrayList Class Name = " +className);

        //we use simple name of the class because we have used single typed import or specified location in imports.
        System.out.print("import from garden.vegetable Package: ");
        VineVegetable.main(args); // prints imports from garden.vegetable Package.
        System.out.print("import from nursery.vegetable Package: ");
        nursery.vegetable.VineVegetable.main(args); // prints imports from nursery.vegetable sub package of garden.vegetable Package!
        garden.vegetable.VineVegetable1.main(args);
    }
}
class VineVegetable1 {
    public static void main(String[] args) {
        System.out.println("Local VineVegetable,From garden.vegetable");
    }
}