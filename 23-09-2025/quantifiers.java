public class quantifiers {

    public static void main(String args[])
    {
    //    String str1="abc def";

    //    System.out.println(str1.matches(".*")); //  true

    //   String str1="aBcdef"; //ab6cdef ->  false

    //    System.out.println(str1.matches("[a-z]*")); // false

     // String str1="abc"; // its takes only 3 letters, if you give 4 letters it will give false

       String str1="ayushkumar@gmail.ocm";

       System.out.println(str1.matches("\\w*@gmail(.*)")); //true

    //    System.out.println(str1.matches(".*gmail.*")); //true
    }
    
}
