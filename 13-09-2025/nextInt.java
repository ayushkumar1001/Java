import java.util.Scanner;
public class nextInt {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two number");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("sun is -> " + c);
    }

}