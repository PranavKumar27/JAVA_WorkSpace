// package Arithmetic;

public class Swapping {
    public static void main(String Args[])
    {
        int x = 9;
        int y = 12;

        System.out.println("Before Swap x = " + x + " y = " + y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After Swap x = " + x + " y = " + y);

        byte a1 = 9,b1=12;

        byte c ;
        c = (byte)(a1<<4); 
        c = (byte)(c | b1);

        System.out.println("First nibble or 4 bits Value set in c = " + ((c&0b11110000)>>4));

        System.out.println("Last nibble or 4 bits Value set in c = " + (c&0b00001111));

        System.out.println("c = " + String.format("%s", Integer.toBinaryString(c & 0xFF)) + "  c = " + c);

        System.out.println("c = " + String.format("%s", Integer.toBinaryString(c)) + "  c = " + c);

        System.out.println(String.format("%32s",Integer.toBinaryString(0xFF)));

    }
}
