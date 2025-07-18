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

        System.out.printf("%1$s %2$s , %3$f, %4$d , %1$s , %3$e \n\n\n",str,str1,y,x);
        
        //System.out.printf("%3$s %2$f , %4$s, %1$d , %3$s , %2$e \n",str,str1,x,y); 

        // Format Specifier Order is independent of order of arguments
        // %1$s %2$s , %3$f, %4$d , %1$s , %3$e
        // str, str1,   y,    x     
        // This is wrong Error as : IllegalFormatConversionException: f != java.lang.String
        // "%3$s %2$f , %4$s, %1$d , %3$s , %2$e \n",str,str1,x,y);


        int a = 10,b=100,m=1000,xd=10000;
        System.out.printf("%05d\n",a);
        System.out.printf("%(5d\n",b);
        System.out.printf("%(05d\n",m);
        System.out.printf("%+5d\n\n",xd); // If + is used and number is positive then +10000 is shown

        a = -10;b=-100;m=-1000;xd=-10000;
        System.out.printf("%5d\n",a);
        System.out.printf("%(5d\n",b); // Bracket is closed automatically ?? ONly for Neg Number
        System.out.printf("%(5d\n",m); // If Bracket is shown Sign is not shown So   Note --->    -1000 = (1000)
        System.out.printf("%+5d\n\n",xd); // If + is used and number is negative the -10000 is shown


        float nf = 123.45f;
        System.out.printf("%f\n",nf);   // 6 digits after Decimal
        System.out.printf("%4f\n",nf);  // 4 digits after Decimal -- incorrect 6 digits
        System.out.printf("%14f\n",nf);  // 14 digits after Decimal -- incorrect 14 tabs total shows only 6 digits after Decimal
        System.out.printf("%1.3f\n",nf); // 1 digits before Decimal and 3 after it -- incorrect All digits before decimal and 3 digits after Decimal
        System.out.printf("%4.2f\n",nf); // 4 digits before Decimal and 2 after it -- incorrect All digits before decimal and 2 digits after Decimal
    
        float rt = 3.142f;
        System.out.printf("%6.2f\n",rt); // 2 digits included in 6,3 digits before decimal ,decimal/dot takes 1 space, and 2 digits after decimal
        
        System.out.printf("%06.2f\n",rt); // fill empty Spaces with Zero
    
        String str2 = "Java";

        System.out.printf("%20s\n",str2);// 20 spaces left to right
        System.out.printf("%-20s",str2); // 20 Spaces right to left
        System.out.format("%-20s\n",str2); // 20 Spaces right to left
        System.out.printf("%s\n",str1);
    }
}
