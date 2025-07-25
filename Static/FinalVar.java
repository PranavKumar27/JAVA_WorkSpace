package Static;

class FurnaceTempLimits
{
    static final int MIN = -100;
    static final int MAX = 100;
    static final int AVG = 30;

    // During Summer
    static
    {
        // AVG = AVG+5;
        System.out.println("Temp in Summer = " + (AVG+5));
    }

    // During Winter
    static 
    {
        // AVG = AVG-10;
        System.out.println("Temp in Winter = " + (AVG-10));
    }

}
public class FinalVar {
    public static void main(String[] args) 
    {
        FurnaceTempLimits test = new FurnaceTempLimits();    
    }
}
