import java.util.Scanner;

public class TypesOfWebsite {

    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a Domain name");
        String domain=scan.nextLine();

        String ext=domain.substring(domain.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com": System.out.println("Commercial");
            break;

            case "org": System.out.println("Organition");
            break;

            case "gov": System.out.println("Government");
            break;

            case "net": System.out.println("Network");
            break;

            case "biz": System.out.println("Business");
            break;

            default : System.out.println("Invalid Website");
            break;
        }
    }
    
}
