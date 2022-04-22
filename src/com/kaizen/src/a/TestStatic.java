package a;
import a.d.StaticImportTest1;
import static a.d.StaticImportTest1.*; //On-demand type Static import calls reference without class name!!!
import a.e.StaticImportTest2;
//import static a.e.StaticImportTest2.*; // on-demand type Static import
//import static a.e.StaticImportTest2.APP_NAME;
public class TestStatic {
    public static void main(String[] args) {
//For StaticImportTest1....
//APP_NAME in line below can be referenced without class name because of on demand static import statement.
        System.out.println("APP_NAME = " +APP_NAME);
//log name
        log("This is StaticImportTest1");
//We Instantiate StaticImportTest1() and execute a method on it.
        new StaticImportTest1().printUniqueStatement();
//For StaticImportTest2...
//APP_NAME qualified by class name because there are no on-demand imports for StaticImportTest2.
        System.out.println("APP_NAME = " + StaticImportTest2.APP_NAME);
//log name qualified by class name
        StaticImportTest2.log("This is StaticImportTest2");
//We Instantiate StaticImportTest2() and execute a method on it.
        new StaticImportTest2().printUniqueStatements();
    }
}
