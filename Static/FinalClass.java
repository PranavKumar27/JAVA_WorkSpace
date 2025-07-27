package MyStatic;

/*
 * Interface are not final
 * 
 * final interface StaticDemo
{
    void data();
}
 */

 /*
 * Interface Cannot be static
 * 
 * static interface StaticDemo
{
    void data();
}
 */

/*

final class Country{}

The Final Class cannot be extended by any Sub class

*/

class Country
{
    String dep1 = "Railways";
    String dep2 = "DRDO";
    String dep3 = "ISRO";

    final void classDetails()
    {
        System.out.println("classDetails = Country " );
    }
    void displayCountry()
    {
        System.out.println("Country's Department = "  + dep1 + " , " + dep2
        +" , " + dep3 );
    }
}

class State extends Country
{
    String d1 = "METRO";
    String d2 = "ROADWAYS";
    String d3 = "REVENUE";

    // Final Method Cannot be overridden
    /*
     * void classDetails()
        {
            System.out.println("classDetails = State " );
        }
     * 
     */
    
    void displayState()
    {
        System.out.println("State's Department = "  + d1 + " , " + d2
        +" , " + d3 );
    }
}

public class FinalClass {
    static final int a;
    final int b;
    final int c;

    // Type 1 to init final variable we have to make final variable a as static- 
    // Callled Static instance Block initialization
    static
    {
        a =100;
    }

    // Type 2 to init final varible in a block Called as Instance Block initialization
    {
        b = 200;
    }

    // Type 3 to init final variable using constructor
    public FinalClass() {
        this.c = 300;
    }
    
    
    public static void main(String[] args) 
    {
        final float PI = 3.142f;
        Country c1 = new Country();
        c1.displayCountry();
        
        
        Country C2 = new State();
        C2.classDetails();
    }
}
