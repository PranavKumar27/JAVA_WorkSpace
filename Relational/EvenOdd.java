// package Relational;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String []Args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Num is even = "+n);
        }
        else
        {
            System.out.println("Num is odd = "+n);
        }

        System.out.println("Enter a Number :");
        String val = sc.next();

        if(val.matches("[0-1]+"))
        {
            System.out.println("Binary No = "+val + " Radix = 2");
        }
        else if(val.matches("[0-7]+"))
        {
            System.out.println("Octal No = "+val  + " Radix = 8" );
        }
        else if(val.matches("[0-9]+"))
        {
            System.out.println("Decimal No = "+val  + " Radix = 10" );
        }
        else if(val.matches("0x[0-9a-fA-F]+"))
        {
            System.out.println("Hexdecimal No = "+val + " Radix = 16");
        }
        else
        {
            System.out.println("Not a Known Format Number  = "+val + " Radix = UNKNOWN");
        }

        System.out.println("Enter the Year to check if it is a Leap Year");

        int year = sc.nextInt();

        if(year%4==0)
        {
            if(year%100 == 0)// millenium year In every hundered year, we skip a year
            {
                if(year%400 == 0)
                {
                    System.out.println("A Leap Year = " + year);
                }
                else
                {
                    System.out.println("Not a Leap Year = " + year);
                }
            }
            else
            {
                System.out.println("A Leap Year = " + year);
            }
        }
        else
        {
            System.out.println("Not a Leap Year = " + year);
        }
        

    }
}
