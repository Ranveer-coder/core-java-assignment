import java.util.Locale;

public class Switch2 {
    public static void main(String[] args) {


        char switchExp = 'A';

        switch (switchExp) {

            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println(switchExp + " Was found");
                System.out.println("All are present");
                System.out.println("You Pressed CASE : " + switchExp);
                break;

            default:
                System.out.println("Not Found");
                break;
        }

                String month = "JuNe";
            switch (month.toLowerCase()) {
                case "jan":
                System.out.println("Jan");
            break;
                case "june":
                    System.out.println("June");
                    break;

                default:
                    System.out.println("Not Sure");
                    break;

                }
        }
    }
