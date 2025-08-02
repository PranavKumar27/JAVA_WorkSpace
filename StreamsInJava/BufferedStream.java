import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)  throws IOException
    {
        FileInputStream fis = new FileInputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");
        // BufferedInputStream is used when consumer and Producer speed are different 
        // and this speed can be matched using a Buffer in between them.
        // Performance of System improves if a Buffer is used in between
        // FIS <--> Buffer <--> Prog
        //                      Prog <--> Buffer <--> FIS
        BufferedInputStream bis = new BufferedInputStream(fis);

        // int x;
        // bis.mark(5);
        // while((x=bis.read())!=-1)
        // {
        //     System.out.print((char)x);
        //     bis.reset();
        // }

        System.out.println("\nFile Supports Mark = "+fis.markSupported());
        System.out.println("Buffer Supports Mark = "+bis.markSupported());
        // A file moves only forward Just like Caseetes Tapes
        // But a buffere can move both direction, It supports mark() and reset()


        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(3);
        for(int i=0;i<6000000;i++)
            System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());


        fis.close();
        bis.close();

        // Writing on file using Buffer

        FileOutputStream fos = new FileOutputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test_Buffer.txt");

        BufferedOutputStream bos = new BufferedOutputStream(fos);

    }
}
