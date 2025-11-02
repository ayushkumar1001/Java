import java.util.*;
public class leapyear {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
         year = sc.nextInt();

      if(year%4==0)
      {
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("Its a Leap Year");
            }
            else
            {
                System.out.println("Not Leap Year");
            }
        }
        else
        {
            System.out.println("Its a Leap Year");
        }
      }
      else
      {
        System.out.println("Not a Leap Year");
      }
    
}
}
