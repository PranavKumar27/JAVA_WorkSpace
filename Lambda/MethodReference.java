
@FunctionalInterface
interface MyLambda
{
    public void display(String str);

}
@FunctionalInterface
interface MyLambda2
{
    public int compareTo(String str1,String str2);

}

class MethodRef
{

    public MethodRef() {}
    public MethodRef(String s) 
    {
        System.out.println("Uppercase = " + s.toUpperCase());
    }
    
    public static void greet(String msg)
    {
        System.out.println("Greeting = "+msg);
    }
    public void show(String msg)
    {
        System.out.println("Hello " + msg);
    }
}

public class MethodReference {

    public static void reverse(String s)
    {
        String str = s.toUpperCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reverse = " +sb);
    }
    public static void main(String args[])
    {
        System.out.println("Assign System.out::println to Lambda");
        MyLambda m1 = System.out::println;
        m1.display("Hello");

        System.out.println("Assign static method of diff Class to Lambda");
        MyLambda m2 = MethodRef::greet;
        m2.display("Namaste");


        System.out.println("Assign static method of Same Class to Lambda");
        // Assign static method to Lambda
        MyLambda m3 = MethodReference::reverse;
        m3.display("God created All");

        System.out.println("Assign non static method to Lambda");
        // Assign non static method to Lambda
        MethodRef mrf = new MethodRef();
        MyLambda m4 = mrf::show;
        m4.display("Rahul");

        System.out.println("Assign  Constructor Method to Lambda");
        // Assign  Constructor Method to Lambda
        MyLambda m5 = MethodRef::new;
        m5.display("india");

        System.out.println("Assign String::compareTo to Lambda 2 parameters");
        MyLambda2 m6 = String::compareTo;
        int res = m6.compareTo("hello", "jello");
        System.out.println("res = "+res);
    }
}
