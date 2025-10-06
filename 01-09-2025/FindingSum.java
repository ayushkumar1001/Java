import java.util.*;
public class FindingSum {

    public static void main(String args[])
    {
        int A[] = {3,9,7,8,12,6,15,5,4,10};

        int sum = 0;
        for(int i=0; i<A.length;i++)
        {
            sum = sum + A[i];
        }
        System.out.println("Sum is " +sum);
    }

    //For Each Loops
    
    //     int sum = 0;
    //     for(int X:A)
    //     {
    //         sum = sum + X;
    //     }
    //     System.out.println("Sum is " +sum);
    // }
    
}
