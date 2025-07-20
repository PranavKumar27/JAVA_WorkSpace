// package ArraysInJava;

public class TwoDArry {
    public static void main(String []args)
    {
        int A[][] = new int[3][4];
        
        int B[][] = { {1,2,3,4},{2,3,4,5},{3,4,5,6}};

        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[i].length;j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println();

        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        // Jagged Array - Arrys of different sizes
        int C[][] = new int[3][];
        C[0] = new int[2];
        C[1] = new int[3];
        C[2] = new int[4];


        for(int x[]:C)
        {
            for(int y:x)
            {
               System.out.printf("%d ",y);
            }
            System.out.printf("\n");
        }

        int[] E,F[];
        E = new int[5];
        F = new int[5][5];

        int G[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int x[]:G)
        {
            for(int y:x)
            {
                System.out.printf("%d ",y);
            }
            System.out.printf("\n");
        }


        String arr[] = {"java","c++","c","python","golang","php","javascript","ada","html","aws","css"};

        java.util.Arrays.sort(arr);

        for(String x:arr)
        {
            System.out.print(x+" , ");
        }

        System.out.println();


    }
}
