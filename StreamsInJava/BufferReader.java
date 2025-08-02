// package StreamsInJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) {
    /*  Reader is used for character
    *  InputStream is used for bytes
    * - Use InputStream for binary data (images, audio, etc.).
        - Use Reader for text data, especially 
            when encoding matters (UTF-8, UTF-16, etc.).
    */
    try(FileReader fr = new FileReader("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");BufferedReader br = new BufferedReader(fr);)
    {
        // int x;
        // br.mark(5);
        // while((x=br.read())!=-1)
        // {
        //     System.out.print((char)x);
        //     br.reset();
        // }

        System.out.println("\nFile Supports Mark = "+fr.markSupported());
        System.out.println("Buffer Supports Mark = "+br.markSupported());
        // A file moves only forward Just like Caseetes Tapes
        // But a buffere can move both direction, It supports mark() and reset()


        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.mark(3);
        
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.reset();
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());

        System.out.println();
        // Text can be read using br.readLine() 
        // This is a special method available only for BufferReader
        // Since Buffer Reader is for reading characters
        System.out.println( "String = " + br.readLine());
    }
    catch(FileNotFoundException e)
    {
        e.printStackTrace();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }

    }
}
