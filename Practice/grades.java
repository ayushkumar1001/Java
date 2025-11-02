import java.util.Scanner;

public class grades {

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your gardes");

       int m1,m2,m3;

       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();

       float avg=(float)(m1+m2+m3)/3;

        if(avg>=70)
        {
            System.out.println("Grades A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("Grades B");
        }
        else if (avg>=50 && avg<60)
        {
            System.out.println("Grades c");
        }
        else if (avg>=40 && avg<50)
        {
            System.out.println("Grades D");
        }
        else 
        {
            System.out.println("Grades e");

        }


    }
    
}
