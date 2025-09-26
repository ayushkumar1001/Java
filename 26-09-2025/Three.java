import java.util.Scanner;
public class Three {

    public static void main(String args[])
    {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        n=sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("This is Even");
        }
        else
        {
            System.out.println("This is Odd");
        }

    }
    
}
