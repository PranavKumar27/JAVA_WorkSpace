import java.util.Scanner;

public class PreIncrement {
    public static void main(String args[])
    {
        int x = 5;
        int y = x++;

        print(x);
        print(y);

        x = 5;
        int z = ++x;
        print(x);
        print(z);

        x=5;y=4;
        int res = 2*x++ + 3 * ++y;
        print(res);

        x=5;y=4;
        int res2 = 2*x++ + 3 * ++x;
        print(res2);

        float f=3.5f;
        ++f;
        System.out.println("f = "+f);

        char cx = 65;
        ++cx;
        print(cx);

        byte mb = 10;
        mb++;
        // mb = mb+1;  <--- Error 
        print(mb);
        
        byte t = -10;
        int q = t>>>1;
        Scanner sc = new Scanner(System.in);
        String s = Integer.toBinaryString(q);
        System.out.println("Bin = " +s);
        print(q);
    }
    static void print(int x)
    {
        System.out.println("Data= "+x);
    }

}
