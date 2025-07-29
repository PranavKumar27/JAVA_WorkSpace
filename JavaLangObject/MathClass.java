// package JavaLangObject;

public class MathClass {
    public static void main(String[] args) 
    {
        System.out.print("Absolute : ");
        System.out.println(Math.abs(-123.34));
        
        System.out.print("Absolute : ");
        System.out.println(StrictMath.abs(-123.34));

        System.out.print("Cube Root : ");
        System.out.println(Math.cbrt(27));

        System.out.print("Exact Decrement : ");
        // If decrement fails Here it throws exception as 
        //java.lang.ArithmeticException: integer overflow
        // System.out.println(Math.decrementExact(Integer.MIN_VALUE)); 
        
        // Test for Exact Decrement
        byte val = Byte.MIN_VALUE;
        System.out.println("Before val : "+val);
        val--;
        System.out.println("After val : "+val);


        System.out.print("Exponent value in Floating Point Rep : ");
        System.out.println(Math.getExponent(12.3456));
        System.out.printf("Value = %e",12.3456f);
        System.out.println();

        System.out.print("Round Division : ");
        System.out.println(Math.floorDiv(49,9));

        System.out.print("e Power of x : ");
        System.out.println(Math.exp(1));

        System.out.print("StrictMath e Power of x : ");
        System.out.println(StrictMath.exp(1));

        System.out.print("Log Base 10 : ");
        System.out.println(Math.log10(1000));

        System.out.print("Max : ");
        System.out.println(Math.max(10, 20));

        System.out.print("tan : ");
        System.out.println(Math.tan(45*Math.PI/180)); // tan 45 = 1

        System.out.print("Radian ");
        System.out.println(Math.toRadians(90));

        System.out.print("aTan ");
        System.out.println(Math.toDegrees(Math.atan(1)));

        System.out.print("Convert to degree : ");
        System.out.println(StrictMath.toDegrees(StrictMath.atan(1)));

        System.out.print("Random No : ");
        System.out.println(Math.random()*1000); // To get 3 digit No Multiply with 1000

        System.out.print("Power : ");
        System.out.println(Math.pow(2, 3));

        System.out.print("Exact Product: ");
        // Throws error if product Overflow 
        // java.lang.ArithmeticException: integer overflow
        System.out.println(Math.multiplyExact(250000, 700));

        System.out.print("Next Floor Value : ");
        System.out.println(Math.nextAfter(12.7, 13));

        System.out.print("Prev Floor Value : ");
        System.out.println(Math.nextAfter(12.7, 11));

    }
}
