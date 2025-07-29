// package JavaLangObject;

public class JavaFloatWrapper {
    public static void main(String args[])
    {
        float a = 12.5f;
        Float b = 12.5f;
        Double a1 = 12.5;
        Float c = 12.5f/1;
        Float res1 = (float)Math.sqrt(-1);
        Float res2 = (float)Math.sqrt(9);

        System.out.println("Is Equal = "+b.equals(a));
        System.out.println("Is Equal float <=> double = "+a1.equals(a));
        System.out.println("c.isInfinite() = "+c.isInfinite());
        System.out.println("POSITIVE_INFINITY= " + Float.POSITIVE_INFINITY);
        System.out.println("NEGATIVE_INFINITY= " + Float.NEGATIVE_INFINITY);
        System.out.println("Float.isNaN= " + Float.isNaN(c));
        System.out.println("Float.isNaN(sqrt(-1))= " + Float.isNaN((res1)));
        System.out.println("Float.isNaN(sqrt(9))= " + Float.isNaN((res2)));
        System.out.println("Float.NaN= " + (Float.NaN));
        System.out.println("Float Is Inf = " + (c ==Float.POSITIVE_INFINITY));


        // Character 
        Character C1 = Character('A');
        
        Boolean B1;
    }
}
