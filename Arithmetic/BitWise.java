// package Arithmetic;

public class BitWise {
    public static void main(String args[])
    {
        int x=10,y=6,z;
        
        z=x&y;
        
        String Str_x = Integer.toBinaryString(x);
        String Str_y =  Integer.toBinaryString(y);

        int bin_x = Integer.parseInt(Str_x,2);

        int bin_y = Integer.parseInt(Str_y,2);

        print("bin_x = ",bin_x);
        print("bin_y = ",bin_y);

        int p = 0b1010;
        int q = 0b0110;
        print("p = ",p);
        print("q = ",q);
        int s = p|q;
        int r = p^q;

        print("p|q = ",s);
        print("p^q = ",r);

        System.out.println("x = " + Integer.toBinaryString(x) + "\ny = 0" + Integer.toBinaryString(y) + "\nz = 00"+Integer.toBinaryString(z));

        print("z=",z);

        print("x=",x);
        print("y=",y);

        int a1 = 0b1;
        int y1;
        y1 = a1<<1;

        print("a1<<1 = ",y1);

        int y2 = a1<<2;

        print("a1<<2 = ",y2);

        int y3 = a1<<3;

        print("a1<<3 = ",y3);

        int z1 = y3>>1;

        print("y3>>1 = ",z1);
        int z2 = y3>>2;
        print("y3>>2 = ",z2);

        int z3 = y3>>3;
        print("y3>>3 = ",z3);

        int r1 = -0b1010;
         System.out.println(String.format("%s",Integer.toBinaryString(r1)));
        print("r1 = ",r1);
        int w1= r1>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(w1)));
        int w2= r1>>>1;
        System.out.println(String.format("%32s",Integer.toBinaryString(w2)));
        print("w2 = ",w2);
        print("r1>>>1 = ",w1);


        int res1 = 0b1010;

        System.out.println(String.format("%32s",Integer.toBinaryString(res1)));
        
        int res2 = ~res1;

        System.out.println(String.format("%32s",Integer.toBinaryString(res2)));

        print("res 2 = ",res2);

    }
    public static void print(String s, int n)
    {
        System.out.println(s+" : "+n);
    }
}
