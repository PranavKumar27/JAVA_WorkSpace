
import java.lang.*;

public class ConvertToBin {
    public static void main(String args[])
    {
        int x = 5;
        int y = -5;

        System.out.println("x="+Integer.toBinaryString(x));
        System.out.println("x="+Integer.toOctalString(x));
        System.out.println("x="+Integer.toHexString(x));

        System.out.println("y="+Integer.toBinaryString(y));
        System.out.println("y="+Integer.toOctalString(y));
        System.out.println("y="+Integer.toHexString(y));

        char c = 0x095;
        System.out.println(c);

        float f ='a';
        float g = 2;
        //float m = 23.45;
    }
}
