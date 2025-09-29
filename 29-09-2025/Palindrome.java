import java.util.Scanner;

public class Palindrome {

    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int rev = 0, r, m = n;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        // System.out.println(rev);

        if (rev == m)
            System.out.println("It is a Palindrome Number");
        else
            System.out.println("It is not a Palindrome Number");

    }

}
