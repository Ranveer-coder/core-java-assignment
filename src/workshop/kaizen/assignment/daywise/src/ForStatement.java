import com.sun.javafx.binding.StringFormatter;

public class ForStatement {
    public static void main(String[] args) {
        System.out.println("10k at 2% interest " + calculateInterest(10000.0,2.0));
        System.out.println("10k at 3% interest " + calculateInterest(10000.0,3.0));
        System.out.println("10k at 4% interest " + calculateInterest(10000.0,4.0));
        System.out.println("10k at 5% interest " + calculateInterest(10000.0,5.0));


        for(double i=6;i<=20;i++){
            System.out.println("10k at " + i +  " interest = " + calculateInterest(10000,i));
        }
        for(double i=8;i>=2;i--){
            System.out.println("10k at " + i +  " interest = " + calculateInterest(10000,i));
        }

        int count = 0;
        for(int j=10;j<50;j++){
            if(isPrime(j)){
                count++;
                System.out.println("Number " + j + " is a Prime No");
                if(count == 10){
                    System.out.println("Exit loop");
                    break;
                }
            }
        }



    }
        public static  double calculateInterest(double amount,double interestRate){
            return(amount*(interestRate/100));
        }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {

            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }

}



