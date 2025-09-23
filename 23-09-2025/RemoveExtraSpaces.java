public class RemoveExtraSpaces {

    public static void main(String args[])
    {
        String str="abc     de      fgh     ijk   ";

       //System.out.println(str.replaceAll("\\s", " "));
       System.out.println(str.replaceAll("\\s+", " ").trim());

    }
    
}
