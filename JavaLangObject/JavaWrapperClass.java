// package JavaLangObject;

public class JavaWrapperClass {
    public static void main(String[] args) 
    {
        int i = 10; // Primitive or Built In Data Type
        
        // Intger a = new Integer(10);
        Integer p = Integer.valueOf(20);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("15");

        Byte e = Byte.valueOf((byte)15);

        Short f = Short.valueOf("45");

        float g = 12.3f; // internally calls valueOf()

        Float h = Float.valueOf(56.33f);

        

        Double k = Double.valueOf(78.23);

        Character l = Character.valueOf('A');

        Boolean m = Boolean.valueOf("true");

        Boolean n = false;
        
        Float j = Float.valueOf("45.99");
        float x = j.floatValue();  // Auto UnBoxing
        float y = h;

        int r = 10;
        Integer rb = r; // Auto Boxing
        Integer rt = Integer.valueOf(r);

        int st1 = rb; // Auto Unboxing
        int st2 = rt.intValue();

        int m1 = 15;
        Integer m2 = m1;
        Integer m3 = 20;
        System.out.println("m2.compareTo(m1) = " + m2.compareTo(m1));

        System.out.println("m2.equals(m1) = " + m2.equals(m1));


        System.out.println("m3.compareTo(m1) = " + m3.compareTo(m1));

        System.out.println("m3.equals(m1) = " + m3.equals(m1));

        int e1 = 15;
        Long e11 = Long.valueOf("99999999999999999"); // Integer throws Error as 
        // java.lang.NumberFormatException: For input string: "999999999999"

        Integer e2 = Integer.valueOf("1010", 2);
        Integer e3 = Integer.valueOf("1F",16);
        Integer e4 = Integer.valueOf("22",8);

        System.out.println("e11 = " + e11);
        System.out.println("e2 = " + e2);
        System.out.println("e3 = " + e3);
        System.out.println("e4 = " + e4);


        Integer n1 = Integer.MAX_VALUE;
        Integer n2 = Integer.bitCount(e2);
        Integer n3 = Integer.decode("0x6A");
        Integer n4 = Integer.parseInt("1245678");
        //Integer n5 = Integer.parseInt("12A");
        Integer n6 = Integer.reverseBytes(10);
        String str1 = Integer.toBinaryString(10);
        String str2 = Integer.toBinaryString(n6);
        
        //Integer n7

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        //System.out.println("n5 = " + n5);
        System.out.println("n6 = " + n6);
        System.out.println("str1 = " + String.format("%032d",Integer.parseInt(str1)));
        System.out.println("str2 = " + String.format("%32s",str2));
    }
}
