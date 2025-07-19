// package ArraysInJava;

import java.util.Scanner;

public class ArrayQuestions {
    
    public static void main(String[] args) {
        int Arr[] = new int[10];

        System.out.println("Enter 10 numbers : ");
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<Arr.length;i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Sum =" + SumOfArr(Arr));

        System.out.println("Second Largest Element = " + secondLargestElement(Arr));

        System.out.println("Enter pos to Rotate left :");
        int pos = sc.nextInt();

        RotateArry(Arr,pos);
        
    }

    static int SumOfArr(int[]Arr)
    {
        int sum = 0;
        for(int x:Arr)
        {
            sum+=x;
        }
        return sum;
    }

    static int secondLargestElement(int []A)
    {
        int fl=A[0],sl=A[0];
        for(int x:A)
        {
            if(x>fl)
            {
                sl=fl;
                fl=x;
            }
            else if(x>sl) // Here it implies x<fl no need to check
            {
                sl = x;
            }
        }
        return sl;
    }

    static void  RotateArry(int []Arr,int pos)
    {
        int n = Arr.length;

        int [] temp = new int[pos];

        for(int i=0;i<pos;i++)
        {
            temp[i] = Arr[i];
        }

        for(int r:temp)
        {
            System.out.print(r);
        }
        System.out.println("");
        int k=0;
        int i;
        for(i=pos;i<Arr.length;i++)
        {
            Arr[k] = Arr[i];
            k++;
        }

        int j=0;
        for(;k<Arr.length;k++)
        {
            Arr[k] = temp[j];
            j++;
        }

        for(int d:Arr)
        {
            System.out.print( d + " , ");
        }
        System.out.println("");
    }
}
