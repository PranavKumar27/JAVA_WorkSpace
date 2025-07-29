package JavaLangObject;

import java.lang.reflect.*;

class Test
{
              int a;
    private   float b;
    protected String c;
    public    boolean d;

    Test(){}
    Test(int a,float b,String c,boolean d) {}
    public void display(int a,float b,String c,boolean d){}
    public String ConcatData(int a,float b,String c,boolean d) { return "NULL";}
}

public class JavaReflection {
    public static void main(String[] args) {
        Test t = new Test();
        Class C1 = t.getClass();

        Class C2 = Test.class;

        System.out.println("\n >>>>>>>>>> Constructor List : \n ");
        Constructor Arr1[] = C1.getDeclaredConstructors();
        for(Constructor c:Arr1)
        {
            System.out.println(c);
        }

        System.out.println("\n >>>>>>>>>>> All Methods List : \n ");
        Method Arr2[] = C1.getMethods();

        for(Method m:Arr2)
        {
            System.out.println(m);
        }

        System.out.println("\n >>>>>>>>>>> Declared Methods List : \n ");
        Method Arr23[] = C2.getDeclaredMethods();

        for(Method m:Arr23)
        {
            System.out.println(m);
        }

        System.out.println("\n >>>>>>>>>>> Parameters List : \n ");
        Parameter param[] = Arr23[0].getParameters();

        for(Parameter p:param)
        {
            System.out.println(p);
        }

        System.out.println("\n >>>>>>>>>>> Fields List Data Members : \n ");

        Field Arr3[] = C1.getDeclaredFields();

        for(Field f:Arr3)
        {
            System.out.println(f);
        }

        // C1.get
        // System.out.println("\n >>>>>>>>>>>  : \n ");

        // C1.getMethod();
        // C1.getDeclaredConstructors();
        // C1.getDeclaredField(name)
    }
}
