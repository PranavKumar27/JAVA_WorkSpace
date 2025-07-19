
import java.util.Scanner;

//package Loops;

public class Multiples {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println();
        int i = 1;
        while(i<=10)
        {
            System.out.println(n*i);
            i++;
        }
        //System.out.println("Bye");

        System.out.print("Enter a number : ");
        n = sc.nextInt();
        String s = "";

        while(n>0)
        {
            s = s +n%10;
            n=n/10;
        }

        System.out.println("Rev = " + s);

        for(i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            switch(ch)
            {
                case '0': System.out.println("Zero");break;
                case '1': System.out.println("One");break;
                case '2': System.out.println("Two");break;
                case '3': System.out.println("Three");break;
                case '4': System.out.println("Four");break;
                case '5': System.out.println("Five");break;
                case '6': System.out.println("Six");break;
                case '7': System.out.println("Seven");break;
                case '8': System.out.println("Eight");break;
                case '9': System.out.println("Nine");break;
                default: System.out.println("Nan");
            }
        }


    }
}
