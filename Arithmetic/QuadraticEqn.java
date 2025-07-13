
import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String args[])
    {
        System.out.println("Finding Roots of Quadratic Eqn>>>");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double root1 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        
        double root2 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("root 1 >>> "+root1);
        System.out.println("root 2 >>> "+root2);
    }
}
