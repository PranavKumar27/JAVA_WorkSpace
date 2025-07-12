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

        System.out.println("Area 2 Calculating");

        System.out.println("Eneter three side >> ");

        float aa = sc.nextFloat();
        float bb = sc.nextFloat();
        float cc = sc.nextFloat();

        float s = (aa+bb+cc)/2f;

        double area2 = Math.sqrt(s*(s-aa)*(s-bb)*(s-cc));

        System.out.println("Area of triangle = " + area2);

    }
}