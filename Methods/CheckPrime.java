// package Methods;

import  java.util.Scanner;

public class CheckPrime {

    boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    static int gcd(int a,int b)
    {
        // consider a is less than b
        if(a>b)
        {
            a = a^b;
            b = a^b;
            a = a^b;
        }

        int rem;
        do
        {
            rem = b%a;
            b=a;
            a=rem;
        }while(a!=0);

        return b;
    }
    public static void main(String []Args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        CheckPrime ck = new CheckPrime();
        boolean Prime = ck.isPrime(n);

        System.out.println("Is Prime = " +Prime);

        System.out.println("Enter 2 number to find GCD : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a,b));
    }
}
