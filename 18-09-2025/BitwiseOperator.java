
public class BitwiseOperator {

    public static void main(String args[])
    {
       // int x=10,y=6,z;
       int x=0b1010;
       //int y=0b0110;
       //int z;

        //z=x&y;
       //z=x|y;
       //z=x^y;+
       

      // int x=0b1;
      //int x=-0b1010;
      int y;
      //y=x<<2;
    //  y=x>>1;
      // y=x>>>1;
      y=~x;

        //System.out.println(z);
          System.out.println(String.format("%s",Integer.toBinaryString(x)));
         //System.out.println(String.format("%s",Integer.toBinaryString(y)));
          System.out.println(String.format("%32s",Integer.toBinaryString(y)));
          System.out.println(y);
    }
}
