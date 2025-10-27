
public class FindPrimeNumber {

    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }


    public static void main(String args[])
    {
        System.out.println(isPrime(19));

        // if(isPrime(91))
        // System.out.println("91 is prime");
    }
    
}
