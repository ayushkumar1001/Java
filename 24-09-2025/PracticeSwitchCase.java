public class PracticeSwitchCase {

    public static void main(String arrgs[]) {

        String str="1";

        switch (str) {
            case "1": System.out.println("One");
            break;

            case "2": System.out.println("Two");
            break;

            case "3": System.out.println("Three");
            break;

            default: System.out.println("Invalid Number");
            break;



        // This code only read that's line whta you call , so that's why this is faster
        // int n = 1;

        // switch (n) {
        //     case 1: System.out.println("One");
        //     break;

        //     case 2: System.out.println("Two");
        //     break;

        //     case 3: System.out.println("Three");
        //     break;

        //     default: System.out.println("Invalid Number");
        //     break;


            // in this case not print Invalid Number
            // case 1:
            //     System.out.println("One");

            // case 2:
            //     System.out.println("Two");
                

            // case 3:
            //     System.out.println("Three");
            //     break;

            // default:
            //     System.out.println("Invalid Number");
            
        }
    }

}

// if else condition
// {
// this code will read line by line code, so that's why this is slow
// int n=1;

// if(n==1)
// {
// System.out.println("One");
// }
// else if(n==2)
// {
// System.out.println("Two");
// }
// else if(n==3)
// {
// System.out.println("Three");
// }
// else
// {
// System.out.println("Invalid Number");
// }
// }