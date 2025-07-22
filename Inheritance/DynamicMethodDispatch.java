// package Inheritance;

class A {}
class B extends A {}

class Super
{
    public void method1() { System.out.println("Method 1 SUPER"); }
    protected A method2() { 
        System.out.println("Method 2 SUPER"); return new A(); }
}

class Sub extends Super
{
    @Override
    public B method2(){ 
        System.err.println("Method 2 SUB"); return new B(); }
    public void method3(){ System.err.println("Method 3 SUB"); }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) 
    {
        // Sub ss = new Super();
        
        Super s = new Sub();

        s.method1();
        s.method2();
        //s.method3();
    }
}
