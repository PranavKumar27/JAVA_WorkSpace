//package String;

public class CheckBinOctHexNum {
    
    public static void main(String args[])
    {
        String bin = args[0]; // binary no
        String hexNum  = args[1];
        String date = args[2];

        boolean b = CheckIfBinaryNum(bin);
        boolean h = CheckIfHexNum(hexNum);
        boolean d = CheckIfDate(date);

        System.out.println( "Is Bin = " + b);
        System.out.println( "Is hex = " + h);
        System.out.println( "Is Date = " + d);

    }

    static boolean CheckIfBinaryNum(String bin)
    {
        boolean b = bin.matches("[01]*");
        return b;
    }

    static boolean CheckIfHexNum(String hexString)
    {
        boolean h = hexString.matches("0x[0-9A-F]+");
        return h;
    }

    static boolean CheckIfDate(String dateString)
    {
        //boolean d = dateString.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        boolean d = dateString.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
        return d;
    }
}
