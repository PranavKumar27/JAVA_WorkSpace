
/*  Interface has all methods as
1) All methods are abstract 
2) All methods are Public 
*/

interface Test
{
    int X  = 10; // Interfaces Can have values but are public static final
    void fun1();
    void fun2();
}

/* By Default Interface Method are 
 *      public
 *         &
 *      abstract
 * Like 
 *  interface Test
    {
        public abstract void fun1();
        public abstract void fun2();
    }

    We can't make method as Private or protected
 */

abstract class NewDemo implements Test
{

}

class Demo implements Test{
    public void fun1()
    {
        System.out.println("Hello Fun1 from Class Demo");
    }
    public void fun2()
    {
        System.out.println("Hi From Fun2 from Class Demo");
    }
    void fun3()
    {
        System.out.println("Bye From Fun3 from Class Demo");
    }
}


public class InterfacePractise {
    public static void main(String args[])
    {
        Demo t = new Demo();
        t.fun1();
        t.fun2();
        t.fun3();
        

        //Test t1 = new Test();
    }
}
