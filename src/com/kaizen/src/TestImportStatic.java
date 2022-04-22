//import for static class variable PI of the Math class
import static java.lang.Math.PI;
//import for static method Sqrt of the Math class
import static  java.lang.Math.sqrt;

//Static on demand type declaration // used to prevent us from writing FQCN in code.
//FQCN can be prevented to be written in source code, if static import on demand is used!
//can be used on both method and variable at same time to avoid error!
//Both static method and static variable can be mentioned by name directly.
//import static java.lang.Math.*;
public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;
//      we can use a static class variable on the math class to get the value of PI.
//      double circumference = 2 * java.lang.Math.PI * radius; // made static imports so can change the code.
        double circumference = 2 * PI * radius;
        System.out.println("Circumference of Circle = " +circumference);
//        We can use a static class method on MATH Class to get the square root of 81.
//        double sqrt81 = java.lang.Math.sqrt(81);
        double sqrt81 = sqrt(81);
        System.out.println("Square root of 81 = " +sqrt81);
    }
}
