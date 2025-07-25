// package Interfaces;

class Outer
{
    static int x=10;
           int y=20;
    
    static class Inner
    {
        void display()
        {
            System.out.println("Value of x = "+x);
            // Non static Member can't be accessed from static context
            // System.out.println("Value of y = "+y);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) 
    {
        Outer.Inner o = new Outer.Inner();
        o.display();    
    }
}
