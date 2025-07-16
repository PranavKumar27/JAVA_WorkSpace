public class Print {
    public static void main(String args[])
    {
        int x = 10,y=20;

        System.out.println(x+y);
        System.out.println(x+y+" Sum");
        System.out.println("Sum = " + x+y);
        System.out.println("Sum = " + (x+y));
        try{
            System.out.println(System.out.getClass());
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        
        System.out.println("Sum of x-> " + x + " and y-> " + y + " = " + (x+y)); 
    }
}
