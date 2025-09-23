public class Binary {
    
    public static void main(String args[])
    {
        // int b=100110; // true

        int b=1800110; // false

        String str =String.valueOf(b);

        System.out.println(str.matches("[01]+"));
    }
}
