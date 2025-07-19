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


    }
}
