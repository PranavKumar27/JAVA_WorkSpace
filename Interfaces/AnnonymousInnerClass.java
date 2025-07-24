/*
 *  Both Interface and Class My behave 
 *  same way
 *  Note we are neither using extends or implements
 * 
 * abstract class My
    {
        abstract void display();
    }
 */

interface My
{
    void display();
}

class Test
{
    void call()
    {
        My obj = new My()
        {
            public void display()
            {
                System.out.println("Display Method of Interface");
            }
        };
        obj.display();
    }
}

/*
 * Local Inner Class - A class inside a Method
 */
class Outer
{
    void updateInnerClass()
    {
        class Inner
        {
            void innerDisplay()
            {
                System.out.println("innerDisplay Method of Class inside Method ");
            }
        }
        Inner in = new Inner();
        in.innerDisplay();
    }
}


/*
 *  
 * 
 */
public class AnnonymousInnerClass {
    public static void main(String[] args) 
    {
        // Annonymous Class Working Example
        Test t = new Test();
        t.call();    


        // Local Class Working Example
        Outer o = new Outer();
        o.updateInnerClass();
    }
}
