// public class MethodOverloading {

//     static int max(int x, int y)
//     {
//         return x>y?x:y;
//     }
//     public static void main(String args[])
//     {
//         System.out.println(max(10,5));
//     }
    
// }


public class MethodOverloading {

    static float max(float x, float y)
    {
        if(x>y)
        return x;
        else
        return y;
    }
    public static void main(String args[])
    {
        System.out.println(max(10.5f, 5.4f));
    }
    
}