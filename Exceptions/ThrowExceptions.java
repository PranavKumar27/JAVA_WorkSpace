package Exceptions;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Negative Dimension is Invalid for Area";
    }
}

public class ThrowExceptions  {

    static int AreaOfRect(int l,int b) throws NegativeDimensionException
    {
        try{
            if(l<0||b<0)
            throw new NegativeDimensionException();
        }
        finally{
            System.out.println("Throwing Exception in AreaOfRect");
        }
        
        
        int a = l*b;
        return a;
    }
    static void CalCulateArea() // static is used here since to be called by main which is static
    {
        // CalCulate Area of Rectangle
        try
        {
            int res = AreaOfRect(-10,20);
            System.out.println("area of Rect = "+res);
        }
        catch(Exception e)
        {
            System.out.println("In CalculateArea() Exception = "+e);
            //e.printStackTrace();
        }
        
    }
    public static void main(String[] args) throws Exception
    {
        try{
            CalCulateArea();
        }
        catch(Exception e)
        {
            System.out.println("Excecption = "+e);
        }
        
    }
}
