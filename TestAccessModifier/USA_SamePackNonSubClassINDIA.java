package Friendship;

public class USA_SamePackNonSubClassINDIA {
    public void display()
    {
        India ind = new India();
        // Can't Access Private Member as b
        System.out.println("Value = " + (ind.a+ind.c+ind.d));
    }    
}
