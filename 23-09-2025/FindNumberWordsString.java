public class FindNumberWordsString {

    public static void main (String args[])
    {
        String str="   abc    de  fg  hi ";

        str=str.replaceAll("\\s", " ").trim();

        String words[]=str.split("\\s");

        System.out.println(words.length);
        
    }
    
}
