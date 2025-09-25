public class TypeCasting {

    public static void main(String args[]) {

        // Example of Widening type casting

        // int num1 = 5004;

        // double num2 = 2.5;

        // double sum = num1 + num2;

        // System.out.println("The Sum of " + num1 + " and " + num2 + " is " + sum);

        // Narrowing Type Casting

        int num = 5004;

        double doubleNum = (double) num;

        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);

        int convertedInt = (int) doubleNum;

        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);

        // Use of Unicode Escape Sequences

        // char unicodeChar = '\u0041';
        // System.out println("Storted Unicode Charcter: " + unicodeChar);

        // OutPut -> Stored Unicode Character: A

        // Assigning Unicode Charcter to variabkle

        // char unicodeChar = 'A';
        // System.out.println("Storted Unicode Character: " + unicodeChar);

        // OutPut -> Stored Unicode Character: A
    }

}
