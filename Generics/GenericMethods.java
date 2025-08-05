// package Generics;

class MyArray<T>
{
    T Arr[] = (T[]) new Object[10];
    int len = 0;

    public void append(T val) { Arr[len++] = val;}
    public void printAll()
    {
        for(int i=0;i<len;i++)
        {
            System.out.println(Arr[i] + " , ");
        }
    }
}

class A {}
class B extends A{}
class C extends B{}

public class GenericMethods {
    static <T> void show(T Arr[])
    {
        for(T data:Arr)
        {
            System.out.print(data + " , ");
        }
        System.out.println();
    }

    static <N extends Number> int sum(N ...Arr)
    {
        int res = 0;
        for(N x:Arr)
        {
            res =  res + (int)x;
        }
        return res;
    }
    // Lower Bound static void fun(MyArray<? super Number> obj)
    // Upper Bound static void fun(MyArray<? extends Number> obj)
    static void funUpperBound(MyArray<? extends Number> obj)
    {
        obj.printAll();
    }
    static void funLowerBound(MyArray<? super B> obj)
    {
    }
    public static void main(String[] args) 
    {
        // Generic Method
        show(new String[]{"Hello","Hi","Bye"});
        show(new Integer[]{1,2,3,4});

        int ans = sum(1,2,3,4);
        System.out.println("Sum = "+ans);

        MyArray<String> ma1 = new MyArray<>();
        ma1.append("India");
        ma1.append("Cananda");
        //funUpperBound(ma1);

        MyArray<Integer> ma2 = new MyArray<>();
        ma2.append(10);
        ma2.append(20);
        funUpperBound(ma2);

        MyArray<B> Ma1 = new MyArray<>();
        MyArray<C> Ma2 = new MyArray<>();
        MyArray<A> Ma3 = new MyArray<>();

        funLowerBound(Ma1); // B has super as A
        //funLowerBound(Ma2); // Error
        funLowerBound(Ma3); // A is super of A
    }
}
