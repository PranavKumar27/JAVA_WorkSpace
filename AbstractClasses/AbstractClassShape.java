

abstract class Shape
{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape
{
    private int radius;

    public Circle() {}
    public Circle(int r) { radius =r; }

    double perimeter()
    { return 2*(Math.PI)*radius;}

    double area()
    { return Math.PI*radius*radius;}
}

class Rectangle extends Shape
{
    public int length,breadth;
    Rectangle(){}

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    double perimeter() { return 2*(length+breadth); }
    double area() { return length*breadth; }
}


public class AbstractClassShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(10);
        Shape s2 = new Rectangle(8,3);

        System.out.println("Perimeter of Circle = "+s1.perimeter());
        System.out.println("Area of Circle = "+s1.area());

        System.out.println("Perimeter of Rectangle = "+s2.perimeter());
        System.out.println("Area of Rectangle = "+s2.area());
    }
}
