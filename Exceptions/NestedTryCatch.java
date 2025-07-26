// package Exceptions;

public class NestedTryCatch {
    public static void main(String[] args) 
    {
        try
        {
            int A[] = {5,0,3,4,5};
            int c;
            try
            {
                c = A[0]/A[1];
                System.out.println("c = "+c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Exception 1 Division by Zero is not allowed = "+e);
            }

            System.out.println("A[10] = "+A[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception 2 = "+e);
        }
        

    }
}
