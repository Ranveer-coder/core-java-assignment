package Vehicle.car;

import Vehicle.car.*;
import Vehicle.bike.*;
public class testCarImport {
    public static void main(String[] args) {
        java.lang.String s = "We are Testing ways to import car";
        System.out.println(s);

        Car.main(args);
        Vehicle.bike.Bike.main(args);
        Bike.main(args);
    }
}
class Bike {
    public static void main(String[] args) {
        System.out.println("We have a local Bike.");
    }
}