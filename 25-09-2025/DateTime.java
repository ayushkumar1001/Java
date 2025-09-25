import java.util.Date;
public class DateTime {

    public static void main(String argsp[])
    {
        Date date = new Date();
       // System.out.println(date.toString());

       //String str = String.format("Current Date/Time : %tc", date );
      //System.out.printf(str);

       System.out.printf("%1$s %2$tb %2$td, %2$ty", "Due date:", date);
    }
    
}
