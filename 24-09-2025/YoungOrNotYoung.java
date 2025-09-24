import java.util.Scanner;
public class YoungOrNotYoung {

    public static void main(String args[])
    {
        int age;

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter your age");
        age=sc.nextInt();

        if(age>=14 && age<=55)
        {
            System.out.println("I am a Young");
        }
        else
        {
            System.out.println("I am Not a Young");
        }
    }
    
}
