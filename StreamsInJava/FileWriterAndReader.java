// package StreamsInJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReader {
    public static void main(String args[])
    {
        try
        {
            // Write Using FileWriter
            FileWriter fwr = new FileWriter("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test2.txt");

            String str4 = "Java is most widely Used";
            fwr.write(str4);
            fwr.close(); // Close of FileWriter
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Excpetion 1 --> " + e);
        }
        catch(IOException e)
        {
            System.out.println("Excpetion 2 --> " + e);
        }

        try
        {
            System.out.println("Read from File Using FileReader and Ascii -->  ");
            FileReader fr = new FileReader("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test2.txt");

            int y;

            while((y=fr.read())!=-1)
            {
                System.out.print((char)y);
            }
            System.out.println();
            fr.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Excpetion 3 --> " + e);
        }
        catch(IOException e)
        {
            System.out.println("Excpetion 4 --> " + e);
        }
        
    }
}
