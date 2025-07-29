

// package JavaLangObject;

enum Color
{
    RED("Red Rose","Symbol of Love"),
    BLU("Blue Sky","Sky is the Limit") , 
    GRE("Green Grass","Feast of the Eye") , 
    ORA("Orange","Health"), 
    WHI("White","Symbol of Peace") , 
    YEL("Yellow","Symbol of Energy and Growth");

    String description;
    String SymbolOf;

    Color(String a,String b)
    {
        description = a; SymbolOf = b;
    }
    String getColor()
    {
        return description;
    }
    String getSymbolOf()
    {
        return SymbolOf;
    }
}
enum Dept
{
    CS, MEC, CVL, ECE, IT;

    private Dept()
    {
        System.out.println("Constructor of Enum Called "+this.name());
    }
    static 
    {
        System.out.println("Inside Dept Static Block ");
    }
    void display()
    {
        System.out.println(this.name() + "  " + this.ordinal());
    }
}

public class EnumInJava {
    public static void main(String[] args) 
    {
        Dept d = Dept.ECE;
        d.display();
        
        System.out.println("d = "+d);
        System.out.println("d.ordinal() = "+d.ordinal());
        System.out.println("d.describeConstable = "+d.describeConstable());
        System.out.println("d.valueOf(IT_) = "+d.valueOf("IT"));

        Dept list[] = Dept.values();

        for(Dept e:list)
        {
            System.out.println("e = "+e);
             System.out.println("e = "+e.describeConstable());
        }

        Dept d1 = Dept.CVL;
        switch(d1)
        {
            case CS:System.out.println("Computer Science Block = "+d1.describeConstable());
                    break;
            case MEC:System.out.println("Mechninal Block = "+d1.describeConstable());
                    break;
            case CVL:System.out.println("Civil Engineering Block = "+d1.describeConstable());
                    break;
            case ECE:System.out.println("Electronicx and Comunication Engg. Block = "+d1.describeConstable());
                    break;   
            case IT:System.out.println("Information Technology Block = "+d1.describeConstable());
                    break;  
            default:System.out.println("Unknown Dept = ");           
        }

        // With Custom Custuctor in Enum we do not need switch

        Color c1 = Color.BLU;
        System.out.println("Color = " +c1.getColor());  
        System.out.println(" SymbolOf = " +c1.getSymbolOf());  

        Color Arr[] = Color.values();

        for(Color c:Arr)
        {
            System.out.print("Color = " +c.getColor());  
            System.out.println(" SymbolOf = " +c.getSymbolOf());  
        }

    }
}
