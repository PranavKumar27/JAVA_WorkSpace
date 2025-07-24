// package Interfaces;

class Outer
{
    static int x = 1;
    Inner in = new Inner();

    class Inner
    {
        int y = 2;
        void displayInner()
        {
            System.out.println("displayInner");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
    }

    void displayOuter()
    {
        System.out.println("displayOuter");
        System.out.println("x = "+x);
        // System.out.println("x = "+y);
        System.out.println("y = "+in.y);
    }
}

public class NestInner {
    public static void main(String[] args) 
    {
        Outer ou = new Outer();
        ou.displayOuter();
        
       // Inner s = new Inner();
        Outer.Inner Inside = new Outer().new Inner();
        Inside.displayInner();

        System.out.println("Static x = "+Outer.x);
    }
}
