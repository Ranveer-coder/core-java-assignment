package a.e;

public class StaticImportTest2 {
    public static final String APP_NAME = "Second";
    public static void log(String statement){
        System.out.println("Second Logging Statement = " +statement);
    }
    public void printUniqueStatements(){
        System.out.println("I'm Second!");
    }
}
