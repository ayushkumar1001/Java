public class StringPractice {

    public static void main(String args[])
    {
        // String str1="f";

        // String str1="8";

        // String str1="%";

        // String str1="abc";  // give result false because . matches only one character

         //String str1="a";

        // System.out.println(str1.matches(".")); // true, because . matches any character

        //   String str1="b";

        //   System.out.println(str1.matches("[abc]")); // true


        // String str1="p";

        // String str1="%";

        // String str1="A";

        // System.out.println(str1.matches("[^a-zA-Z0-9]")); // true //false

        // String str1="a";

        // String str1="a7";

        String str1="k$"; // false


         System.out.println(str1.matches("[a-z][0-9]")); // true 
        
    }
    
}
