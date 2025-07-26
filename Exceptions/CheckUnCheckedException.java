package Exceptions;

class TestPranav extends Exception
{
    public String toString()
    {
        return "Low Balance";
    }
}

public class CheckUnCheckedException {
    static void fun1()
    {
        // Checked Exceptions write try catch is Must since this is checked Exception
        
        //FileInputStream fi = new FileInputStream("Test.txt");
        
        try
        {
            System.out.println("Res= " + (10/0)); // UnChecked Exception
            throw new TestPranav(); // Check Exception 
        }
        catch(Exception e)
        {
            System.out.println("E.GetMessage = "+e.getMessage());
            e.printStackTrace();
        }
        
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }
}
