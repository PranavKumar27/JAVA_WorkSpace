// package Generics;

// Generic are like Templates in C++
class GenericType<T>
{
    T data[] = (T[]) new Object[5];
}

public class ObjectClassParsing {
    public static void main(String args[])
    {
        // Object Obj = new String("India");

        // System.out.println("Obj = "+Obj.toString());

        // String str = (String)Obj;
        // System.out.println("str = "+str);

        // Integer test = (Integer)Obj;
        // System.out.println("integer test = "+test);

        Object ob[] = new Object[3];

        ob[0] = "hi";
        ob[1]= "Hello";
        //ob[2] = Integer.valueOf(10);

        // Object in Object Class can't store both String and Integer
        // Exception thrown java.lang.ClassCastException
        String str;
        for(int i=0;i<2;i++)
        {
            str = (String)ob[i];
            System.out.println("str = "+str);
        }

        // Storing any type of Object in Object Class

        Object obj[] = new Object[5];

        GenericType<String> Tstr = new GenericType<String>();
        Tstr.data[0] = "hello";
        Tstr.data[1] = "hi";
        // Tstr.data[3] = Integer.valueOf(10);

        String res = Tstr.data[0];
        System.out.println("res = "+res);
    }
}
