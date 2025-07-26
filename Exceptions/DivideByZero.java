package Exceptions;

public class DivideByZero {
    public static void main(String args[])
    {
        int a,b,c;
        try
        {
            int A[] = {10,0,3,4,5};
            a=A[0];
            b=A[1];
            c=a/b;
            System.out.println("c = "+c);
            System.out.println("Value A[10] = "+A[10]);

        }
        /*
         * catch(Exception e)
            {
                System.err.println(e);
            } 
         * 
         */
        
        catch(ArithmeticException e)
        {
            //System.err.println(e);
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println(e);
        }
        finally
        {
            // Used to release resources
            System.out.println("Bye ");
        }
        
        
    }
}
