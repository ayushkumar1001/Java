public class Array0 {   // 1 Dimension Array;

    public static void main(String args[]) {
        int A[] = new int[10]; // All these will be initialized with zero

        float B[] = { 1, 2, 3, 4, 5 };

        System.out.println(B.length); // We cannot print all the elements by just using array name. so we have to use loop.

        // int C[];
        // C = new int[10];

        // for (int i = 0; i < A.length; i++) {
        //     System.out.println(A[i]); // result will be 00000000
        // }

        // B[2] = 15;
        // for (int i = 0; i < B.length; i++) {
        //     System.out.println(B[i]); // result will be 1,2,15,4,5.
        // }

        //for Each Loops
        // B[2] = 15;
        // for(int X:B)
        // {
        //     System.out.println(X++);
        // }
        // {
        //     System.out.println(x);
        // }

        // Counter Controlled for Loop.
        // B[2]=15;  
        // for(int i=0;i<B.length;i++)
        // {
        //     System.out.println(B[i]++); // Result will be 1,2,15,5,6.
        // }
        // for(int X:B)
        // {
        //     System.out.println(X); // Result will be 1,2,16,5,6.
        // }

    }

}