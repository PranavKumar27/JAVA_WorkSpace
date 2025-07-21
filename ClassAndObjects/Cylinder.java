// package ClassAndObjects;

class CylinderObj
{
    private double radius;
    private double height;

    public CylinderObj()
    {
        setRadius(1);
        setHeight(1);
    }

    public CylinderObj(double rad)
    {
        setRadius(rad);
        setHeight(1);
    }
    public CylinderObj(double rad,double ht)
    {
        radius = rad;
        height = ht;
    }
    public double area()
    {
        return (2*Math.PI*radius)*height;
    }

    public double volume()
    {
        return (Math.PI*radius*radius)*height;
    }

    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public void setHeight(double h)
    {
        height = h;
    }

}
public class Cylinder {
    public static void main(String []args)
    {
        CylinderObj Cy = new CylinderObj(2.3,7.3);
        // Cy.setRadius(2.3);
        // Cy.setHeight(7.3);

        System.out.println("Area = "+String.format("%1.2f", Cy.area()));
        System.out.println("Area = "+Cy.volume());
    }
}
