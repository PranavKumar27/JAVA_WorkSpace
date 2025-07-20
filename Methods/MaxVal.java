// package Methods;


public class MaxVal {
    
    int max(int a,int b,int c)
    {
        return (a>b && a>c)?a:(b>c)?b:c;
    }

    float max(float a,float b)
    {
        return (a>b)?a:b;
    }

    // int max(int a,int b)
    // {
    //     return (a>b)?a:b;
    // }

    byte max(byte a,byte b)
    {
        return (a>b)?a:b;
    }

    static void updateArray(int []Arr)
    {
        // Can't update using Foreach
        // for(int x:Arr)
        // {
        //     ++x;
        // }

        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]++;
        }
    }
    static void print_Arr(int[] Arr)
    {
        for(int x:Arr)
        {
            System.out.print(" " + x);
        }
        System.out.println();
    }
    public static void main(String []args)
    {
        MaxVal mv = new MaxVal();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 2 Numbers :: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        byte m = 5, n=3;
// V.V.V IMP
        System.out.println("Max of 2 ints = "+mv.max(a,b)); // Calls float max(float a,float b) V.V.V IMP

        System.out.println("Max of 2 Byte = "+mv.max(m,n)); // Calls byte max(byte a,byte b)

        System.out.println("Max of float = "+mv.max(2.3f,4.5f));

        System.out.println("Max of 3 Ints = "+mv.max(a,b,21));

        int Arr[] = {1,2,3,4,5};

        System.out.println("Before Update");
        print_Arr(Arr);

        updateArray(Arr);

        System.out.println("After Update");
        print_Arr(Arr);

    }
}
