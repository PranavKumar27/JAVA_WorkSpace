// package ClassAndObjects;

// int pi = 3.142f;


class Circle
{
    public double radius;

    public double area()
    {
        return (Math.PI)*radius*radius;
    }
    public double perimeter()
    {
        return 2*(Math.PI)*radius;
    }
}

public class GeometricArea
{
    
    public static void main(String ...args)
    {
        System.out.println("Enter Radius : ");
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double r = sc.nextDouble();
        Circle c = new Circle();
        c.radius = r;

        System.out.println("Area of Circle = "+c.area());
        System.out.println("Perimeter of Circle = "+c.perimeter());

    }
}
