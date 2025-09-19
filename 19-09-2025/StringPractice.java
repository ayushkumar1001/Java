public class StringPractice {

    public static void main(String args[])
    {
       // String str1="Java Program"; //String ->Class Name, Str1 -> Reference, "Java Program" -> String Literals/ Literals.
         // System.out.println(str1);

       // String str2=new String("JAVA");
          // System.out.println(str2);

        // char c[]={'H','e','l','l','o'};
        // String str3=new String(c,1,3);
        //  System.out.println(str3);

        // byte b[]={65,66,67,68}; // 65,66,67,68->This a -> A,B,C,D.
        // String str4=new String(b,2,2);
        //  System.out.println(str4);

    //    String str1="Java"; 
    //    String str2="Java";

    //    System.out.println(str1==str2); // -> True

    //    String str1="Java"; 
    //    String str2="java";

    //    System.out.println(str1==str2); // -> False

       String str1="Java"; // -> This will be referring to an object in a pool
       String str2=new String("Java"); // -> for this a new object will be created in a heap.

       System.out.println(str1==str2); // -> False
    
         
    }
}
