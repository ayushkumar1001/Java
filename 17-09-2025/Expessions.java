import java.util.Scanner;
public class Expessions{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        float s;
        double area;

        System.out.println("Enter 3 Sides of a Tringle ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area is "+area);
    }
}