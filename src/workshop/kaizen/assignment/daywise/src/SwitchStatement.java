public class SwitchStatement {

    public static void main(String[] args) {

//        int value = 3;
//        if(value==1){
//            System.out.println("Value is 1");
//        }else if(value==2){
//            System.out.println("VALUE 2");
//        }else{
//            System.out.println("was not 1 or 2");
//        }

        int switchValue = 4;
//switch is for same variables,
// cant change value later like in above case...
        //byte,short,char,int data types ONLY....
        switch(switchValue){
            case 1:
                System.out.println("Value 1");
                break;

            case 2:
                System.out.println("Value 2");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4: case 5: case 6:
                System.out.println("Some other cases");
                System.out.println("Switch value " + switchValue);
                break;

            default:
                System.out.println("neither 1 nor 2");
                break;
        }



    }




}
