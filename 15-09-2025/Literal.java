public class Literal {
    public static void main(String arg[]) {
        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;

        //long l = 125;
        // long l = 999999999999L;
         //int i = 125L; , System.out.println(i);

        long l = 999_999_999;

        System.out.println(l);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4); 


        //float f=12.56f;
        float f = 123_456.56f;
        double d=12.56;

        System.out.println(f);
        System.out.println(d);


    }
}
