package JavaLangObject;

import java.lang.*;


// Every Class in Java is inhertited from Object Class
class TestObject
{
    public int hashCode()
    {
        return 100;
    }
    public String toString()
    {
        return "Pranav Thread";
    }
    boolean equals(TestObject obj)
    {
        // if(this == obj)
        //     return true;
        // else
        //     return false;

        if(this.hashCode() == obj.hashCode())
            return true;
        else
            return false;
    }
    // void notify();
}

class TestObject2 extends TestObject
{

}

public class MyObject {
    public static void main(String[] args) 
    {
        Object obj1 = new Object();
        System.out.println(obj1);
        System.out.println("GetClass ="+obj1.getClass());
        System.out.println("HasCode ="+obj1.hashCode());
        System.out.println(obj1.toString());
        // System.out.println(obj1.notify());
        // System.out.println(obj1.notifyAll());
        System.out.println("obj1 == obj1 " + obj1.equals(obj1));

         Object obj2 = new Object();
         System.out.println("obj1 == obj2 " + obj2.equals(obj1));

         System.out.println("toString = "+obj1.toString() );
        TestObject t = new TestObject();
        System.out.println("HasCode of t= " + t.hashCode());
        System.out.println("Test2 toString()=" +t);
        System.out.println("GetClass ="+ t.getClass());
        TestObject ts = new TestObject();
        System.out.println("HasCode of ts= " + ts.hashCode());
        System.out.println("t == ts= " + t.equals(ts));
    }
}
