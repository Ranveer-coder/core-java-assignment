package Kaizen.coding;
import Divergent.coding.*;
import Kaizen.coding.*;
public class TestJava {
    public static void main(String[] args) {

        String s = "We are testing imports of Divergent and Kaizen!";
        System.out.println(s);

        JavaClass.main(args);
        Kaizen.coding.JavaClass.main(args);

    }
}
class JavaClass1{
    public static void main(String[] args) {
        System.out.println("Local JavaClass in Divergent");
    }
}