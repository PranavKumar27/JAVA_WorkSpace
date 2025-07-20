// package Methods;

public class VaribleArguments {

    static int sum(int...arr)
    {
        int total = 0;
        for(int x:arr)
        {
            total+=x;
        }
        return total;
    }

    static void showList(String...S)
    {
        for(String x:S)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int MaxVal(int...A)
    {
        if(A.length==0)
            return Integer.MIN_VALUE;
        
        int maxi=A[0];
        for(int x:A)
        {
            if(maxi<x)
                maxi=x;
        }
        return maxi;
    }

    // varargs parameter must be the last paramete
    static void print(String message,int...A)
    {
        System.out.println("Message = "+message);
        for(int x:A)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String ...args) {

        int val = sum();
        System.out.println("Passing 0 Argument val = "+val);
        int res = sum(1,3);
        System.out.println("Passing 2 Argument res = "+res);
        int res2 = sum(1,3,90);
        System.out.println("Passing 3 Argument res2 = "+res2);
        int ans = sum(1,2,3,4,5);
        System.out.println("Passing 5 Argument ans = "+ans);
        int A[]={2,3,4,5,6};
        int tot = sum(A);
        System.out.println("Passing Array as Argument tot = "+tot);

        // Annonymous Array Created Here
         System.out.println("Passing ANother Array as Argument tot = "+sum(new int []{1,2,3,4,5,6,7,8,9,10})); 


        System.out.println("NOTE #####   printf is an example of Variable Arg method in JAVA");
        int a = 2, b= 7, c=9,d=11;
        // printf is an example of Variable Arg method
        System.out.printf("%d \n",a);  // 2 Arguments
        System.out.printf("%d %d \n",a,b); // 3 Arguments
        System.out.printf("%d %d %d \n",a,b,c); // 4 Arguments
        System.out.printf("%d %d %d %d \n",a,b,c,d); // 5 Arguments


        print("Hello",1,2,3);
        print("Namaskar",99,98);
        print("Great Day",76);


        showList("Ram","Shyam","Manoj","Dinesh");

        System.out.println("Max_Val = "+MaxVal());
        System.out.println("Max_Val = "+MaxVal(55,99,44,22,101));
        System.out.println("Max_Val = "+MaxVal(new int[]{7,4,9,3,8}));

    }
    
}
