public class ForLoop {

    //Positive Case

    // public static void main(String args[])  
    // {
    //     for(int i = 0; i<=10; i++)
    //     {
    //         System.out.println(i);
    //     }
    // }

    //Condition is Optional
    // public static void main(String args[])  
    // {
    //     int i = 0;
    //     for(; i<=10; i++)
    //     {
    //         System.out.println(i);
    //     }
    // }

    //  public static void main(String args[])  
    // {
    //     int i = 0;
    //     for(System.out.println("Hi"); i<=10; i++)
    //     {
    //         System.out.println(i);
    //     }
    // }

    //Udation is also Optional
    //  public static void main(String args[])  
    // {
    //     int i = 0;
    //     for(; i<=10;)
    //     {
    //         System.out.println(i);
    //         i++;
    //     }
    // }


    // // Infinate Loop
    //  public static void main(String args[])  
    // {
    //     int i = 0;
    //     for(;;)
    //     {
    //         System.out.println(i);
    //         i++;
    //     }
    // }

      // More Than One Variable
     public static void main(String args[])  
    {
        for(int i=0,j=1;  i<=10;  i++,j=j*2)  // "I" ->  is changing Linearly and "J" is changing exponentially.
        {
            System.out.println(i+" "+j);
        }
    }


    // Negative Case
    // public static void main(String args[])  
    // {
    //     for(int i = 10; i>0; i--) 
    //     {
    //         System.out.println(i);
    //     }
    // }
}
