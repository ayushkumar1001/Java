public class Recursion {

    static void fun(int n)
    {
        if(n>0)
        {
            fun(n-1); //result -> 1234567
            System.out.println(n);
            //fun(n-1);//result-> 7654321
        }
    }

    public static void main(String args[])
    {
        fun(7);
    }
    
}
