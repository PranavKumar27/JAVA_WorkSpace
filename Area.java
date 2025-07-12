import java.util.Scanner;

public class Area
{
    public static void main(String args[])
    {
        System.out.println("Program to Find Area of Triangle");
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter Base:");
        double b = sc.nextDouble();

        System.out.println("Enter Height:");
        double ht = sc.nextDouble();

        double area = (b*ht)/2;

        System.out.println("Area = " + area);

    }
}