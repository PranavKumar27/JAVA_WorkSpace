// package ArraysInJava;

public class TestArray {
    public static void main(String[] args)
    {
        int []A = new int[5];

        int B[] = {1,2,3,4,5};

        System.out.println(B.length);

        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+ " -- ");
        }
        System.out.println();

        char C[] = new char[5];
        C[0] = 'A';
        C[1] = 'D';
        C[2] = 'B';
        C[3] = 'M';
        C[4] = 'W';

        for(char cx:C)
        {
            System.out.print(cx + " , ");
        }
        System.out.println();

        B[3] = 300;
        B[2] = 100;
        //B[1] = "ABC";
        System.out.println("Increment Using ForEach Fails");
        for (int i : B) {
            System.out.print(i++ + " , ");
        }
        System.out.println();

        for (int i : B) {
            System.out.print(i + " , ");
        }
         System.out.println( "\nIncrement Using For Works");

        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]++ + " , ");
        }
        System.out.println();

        for (int i : B) {
            System.out.print(i + " , ");
        }
        System.out.println();

        System.out.println("Address of Int  Arr = " + B);

        Float F[] = {1.2f,2.3f};
        System.out.println("Address of Float Arr = " + F);
    }
}
