// package Inheritance;

class Super
{
    int x;
    public void display()
    {
        System.out.println("Hello From Super CLASS");
    }
}

class Sub extends Super
{
    int y;
    //@Override
    public void display(int x)
    {
        System.out.println("Hello from Sub CLASS");
    }
    public void Test()
    {
        System.out.println("Calling Test");
    }
}

public class Overridng {
    public static void main(String[] args) {

        Super su = new Super();
        su.display();


        Sub s = new Sub();
        s.display(1);
        s.Test();

        Super s1 = new Sub();
        s1.display();
        s1.Test(); //Can't Call Test()
    }
}
