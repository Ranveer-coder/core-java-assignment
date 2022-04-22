import offline.learning.*;
import online.learning.*;
public class TestImport {
    public static void main(String[] args) {

        String jp = "We are testing ways to import classes.";
        System.out.println(jp);

        JavaProgramming.main(args); // local class print //I'm Learning by Mentors at Divergent pvt ltd.
        offline.learning.JavaProgramming.main(args); // FQNC printed, Offline package!
        online.learning.JavaProgramming.main(args); //FQNC printed, Online package!
    }
}
class JavaProgramming {
    public static void main(String[] args) {
        System.out.println("I'm Learning by Mentors at Divergent pvt ltd.");
    }
}