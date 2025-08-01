// package StreamsInJava;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;

public class ReadingAndWritingByteArray {
    public static void main(String args[]) throws Exception
    {
        byte bArray[] = {'m','l','k','j','i','h','g','f','e','d','c','b','a'};
        ByteArrayInputStream Bais = new ByteArrayInputStream(bArray);

        // Technique 1 to Read data
        // int x;
        // while((x=Bais.read())!=-1)
        // {
        //     System.out.print((char)x + ",");
        // }

        // Technique 2 to Read data
        byte ByteArr[] = Bais.readAllBytes();
        String str = new String(ByteArr); 
        System.out.println("str = "+str);

        System.out.println("Mark Supported = "+Bais.markSupported());

        Bais.close();


        ByteArrayOutputStream Baos = new ByteArrayOutputStream(20);
        Baos.write('a');
        Baos.write('b');
        Baos.write('c');
        Baos.write('d');

        byte by[] = Baos.toByteArray();

        // Write to Screen
        // for(byte b:by)
        // {
        //     System.out.print((char)b + ",");
        // }

        // Write to File
        FileOutputStream fos = new FileOutputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Testing.txt");
        Baos.writeTo(fos);

        Baos.close();

        char cArr[] = {'a','b','c','d','e','f'};
        CharArrayReader cr = new CharArrayReader(cArr);

        int x;

        while((x=cr.read())!=-1)
        {
            System.out.print((char)x + ",");
        }
        cr.close();

        CharArrayWriter cwr = new CharArrayWriter(20);

        for(char c:cArr)
            cwr.write(c);

        String str2 = new String(cwr.toCharArray());
        System.out.println(str2);

        cwr.close();
    }

}
