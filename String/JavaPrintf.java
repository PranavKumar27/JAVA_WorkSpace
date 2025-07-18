public class JavaPrintf {
    public static void main(String Args[])
    {
        int x = 10;
        float y = 12.5123456789f;
        double d = 0.00786561245678963;
        char c = 'A';
        String str = "Hello";
        String str1 = " World";

        System.out.printf("Hello Indians \n");
        System.out.printf("%s %d %o %x \n",str,x,x,x);
        System.out.printf("%s %c \n",str,c, "sia"); // Can't concatenate ??
        System.out.printf("%f %e \n",y,y);
        System.out.printf("%g %e \n",d,d);

        System.out.printf("%1$d, %2$f, %1$d, %2$f\n",x,y);

        System.out.printf("%1$s %2$s , %3$f, %4$d , %1$s , %3$e \n",str,str1,y,x);
        
        System.out.printf("%3$s %2$f , %4$s, %1$d , %3$s , %2$e \n",str,str1,x,y); 

        // Format Specifier Order is independent of order of arguments
        // %1$s %2$s , %3$f, %4$d , %1$s , %3$e
        // str, str1,   y,    x     
        // This is wrong Error as : IllegalFormatConversionException: f != java.lang.String
        // "%3$s %2$f , %4$s, %1$d , %3$s , %2$e \n",str,str1,x,y);

    }
}
