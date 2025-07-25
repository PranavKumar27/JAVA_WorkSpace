// package Static;

class Test
{
     static int s;

    static
    {
        System.out.println("Hello");
        s = 10;
    }

    static
    {
        s=100;
        System.out.println("S = "+s);
        
    }
}
public class StaticBlock {
    static 
    {
        System.out.println("Called Before Main  -- True");
    }

     
    public static void main(String[] args) 
   {
        Test t = new Test();    
   }

   static 
   {
        System.out.println("Called After Main -- False");
    }
}


