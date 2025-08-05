// package Generics;

// Type 1
// class A {} 
// class B extends A {} 
// class C extends A {} 

// Type 2
interface A {}

class B implements A {} 
class C implements A {}

class Data<T>
{
    T val;

    public T getVal()
    {
        return val;
    }
    public void setVal(T v)
    {
        val = v;
    }
}

@SuppressWarnings("unchecked")
// More than 1 Parameter can also be passed as 
//  class MyArray<T,K>
class MyArray<T>
{
    T Arr[] = (T[]) new Object[10];
    int len = 0;

    public void append(T val)
    {
        Arr[len++] = val;
    }
    public void printAll()
    {
        for(int i=0;i<len;i++)
        {
            System.out.print(Arr[i] + " , ");
        }
        System.out.println();
    }
}
/* Here MyArray2 extends MyArray as an Object
 * Can create Obj of MyArray3 of any type
 */
class MyArray2 extends MyArray
{

}

/* Here MyArray3 extends MyArray as an String 
 * Cannot create Obj of MyArray3 other than String
*/
class MyArray3 extends MyArray<String>
{

}

/* Here MyArray4 extends MyArray as a Generic Type T
 * Can create anytype of Obj of MyArray4 and anytype of MyArray as well
*/
class MyArray4<T> extends MyArray<T>
{

}

// Bounded Class <-- Bound by extends Class

class MyArray5<T extends Number>
{

}

// Even through A is a class or interface we write using keyword extends
class MyArray6<T extends A>  
{

}

public class GetAndSetUsingGenerics {
    public static void main(String[] args) 
    {
        Data<Integer> d1 = new Data<Integer>();
        d1.setVal(15);
        System.out.println("d1 = "+d1.getVal());
        
        Data<String> d2 = new Data<String>();
        d2.setVal("Java is Awesome");

        Data<String> d3 = new Data<String>();
        d3.setVal("C++ is Great");

        Data<String> d4 = new Data<String>();
        d4.setVal("Pyton is Easy");

        Data<String> d5 = new Data<String>();
        d5.setVal("JavaSpring is Best");

        Data<String> dArr[] = new Data[]{d2,d3,d4,d5};

        for(Data<String> obj:dArr)
        {
            System.out.println("obj = "+obj.getVal());
        }

        // Integer Array
        MyArray<Integer> Ma_Int = new MyArray<Integer>();
        Ma_Int.append(10);
        Ma_Int.append(Integer.valueOf(12));
        Ma_Int.append(15);
        
        System.out.println("INTEGER ARRAY");
        Ma_Int.printAll();

        // String Array
        MyArray<String> Ma_Str = new MyArray<String>();
        Ma_Str.append("AUS");
        Ma_Str.append("New Zealand");
        Ma_Str.append("ZIM");

        System.out.println("STRING ARRAY");
        Ma_Str.printAll();

        // GENERIC  Array Can hold Integer, String bool, float anything

        MyArray Ma_Generic = new MyArray<>();
        Ma_Generic.append(12.3f);
        Ma_Generic.append("Java is the best");
        Ma_Generic.append(25);

        System.out.println("GENERIC ARRAY");
        Ma_Generic.printAll();

        // SubTypes of Template Class
        

        MyArray3 Arr3 = new MyArray3();
        Arr3.append("United Nations");
        Arr3.append("China");
        Arr3.append("South Africa");
        System.out.println("SUBTYPE of Template Class as String");
        Arr3.printAll();

        MyArray4<Float> Arr4 = new MyArray4<>();
        Arr4.append(12.96f);
        Arr4.append(22.55f);
        System.out.println("SUBTYPE of Template Class as Float");
        Arr4.printAll();

        // Bounded Array
        MyArray5<Float> My_f = new MyArray5<>();
        // MyArray5<String> My_f2 = new MyArray5<>(); // Error
        // type argument String is not within bounds of type-variable T

        MyArray6<B> Ar6 = new MyArray6<>();
    }
}
