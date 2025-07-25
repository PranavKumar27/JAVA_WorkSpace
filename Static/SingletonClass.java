package Static;

/* In a Office of 5 People we have 1 Coffee maker Machine
 *  Each employee prepares Coffee Using the same coffee Machine
 *  1 Coffee machine instance for all employee Objects
 */
class CoffeeMaker
{
    static final int Sugar;
    static
    {
       Sugar = 1; // in KG
    } 
    final int Milk;
    {
        Milk = 3; // in Litres
    } 
    static final int Coffee = 1; // 1 KG
    static int flavour;
 
    // Keep MaxObjects as per need Keep as 1
    static int MaxObjects = 2;
    static int CurrentInstance=0;

    // Private Constrcutor and Private instanceOf
    // instance of is static since getInstanceOf() is static 
    //and static method can only access static member variables
    private static CoffeeMaker instanceOf = null;
    private CoffeeMaker()
    {
        System.out.println("CoffeeMaker Instance Created");
        flavour = 2;
    }

    static public CoffeeMaker getInstanceOf()
    {
        if(instanceOf==null | CurrentInstance<MaxObjects)
        {
            instanceOf = new CoffeeMaker();
            CurrentInstance++;
        }
        return instanceOf;
    }

}

public class SingletonClass {
    public static void main(String[] args) 
    {
        CoffeeMaker C1 = CoffeeMaker.getInstanceOf();

        CoffeeMaker C2 = CoffeeMaker.getInstanceOf();

        CoffeeMaker C3 = CoffeeMaker.getInstanceOf();
        CoffeeMaker C4 = CoffeeMaker.getInstanceOf();

        System.out.println(" >>>>>> C1 = "+C1 + " \n >>>>>> C2 = " + C2 + " \n >>>>>> C3 = " + C3 + " \n >>>>>> C4 = " + C4  );


        // If Single instance Created
        if(C1==C2 && C1==C3)
            System.out.println("Same Reference Obj is created for SIngleton Class");
        else
            System.out.println("Diff Reference Obj ");

    }
}
