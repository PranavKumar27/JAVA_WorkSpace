class Cicle
{
    public String name = "Circle";
    public int radius;
    public Cicle()
    {
        System.out.println("No-Param Cicle Constructor");
        radius = 1;
    }
    public Cicle(int radius)
    {
        System.out.println("Param Cicle Constructor");
        this.radius = radius;
    }
    public double area()
    {
        System.out.println("Cicle Class area()");
        return (Math.PI*radius*radius);
    }
}

class Cylinder extends Cicle
{
    private int height;
    public String name = "Cylinder";
    public Cylinder(int r, int h)
    {
        super(r);
        System.out.println("Param Cylinder Class Constructor()");
        height = h;
    }
    double Volume()
    {
        System.out.println("Cylinder Class Volume()");
        return area()*height;
    }
    void printClassInhertitance()
    {
        System.out.println("Super Class Name = " +super.name );
        System.out.println("Current Class Name = " +name );
    }
}



public class CircleArea {
    public static void main(String[] args) 
    {
        Cylinder C1 = new Cylinder(5,10);

        System.out.println("Area = "+C1.area());
        System.out.println("Volume = "+C1.Volume());

        C1.printClassInhertitance();

    }
    
}
