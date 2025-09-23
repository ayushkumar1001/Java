public class HexaDecimail {

    public static void main(String args[])
    {
        // String str="234AB"; // true
         String str="B234ABZ"; // false 

        System.out.println(str.matches("[0-9A-F]+"));
    }
    
}
