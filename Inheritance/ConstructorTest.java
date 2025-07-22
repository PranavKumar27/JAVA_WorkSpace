// package Inheritance;

class Parent
{
    public Parent()
    {
        System.out.println("Default Constructor of Parent Class");
    }
    public Parent(int x)
    {
        System.out.println("Parameterized Constructor of Parent Class");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Default Constructor of Child Class");
    }
    public Child(int x)
    {
        System.out.println("Parameterized Constructor of Child Class");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Default Constructor of GrandChild Class");
    }
    public GrandChild(int x)
    {
        super(x);
        System.out.println("Parameterized Constructor of GrandChild Class");
    }
}

public class ConstructorTest {
    public static void main(String[] args) 
    {
        //GrandChild g1 = new GrandChild();   
        GrandChild g2 = new GrandChild(1);    
    }
}
