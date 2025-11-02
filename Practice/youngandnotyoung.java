import java.util.Scanner;

public class youngandnotyoung {
    
    public static void main(String args[])
    {
        Scanner sc =  new Scanner (System.in);

        System.out.println("Enter your age");

        int age;

        age = sc.nextInt();

        if(age >= 14 && age <=55)
        {
            System.out.println("young");
        }
        else
        {
            System.out.println("not Young");
        }
    }
}
