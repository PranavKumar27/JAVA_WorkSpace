// package StreamsInJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadFromFile1WriteToFile2{
    public static void main(String args[])
    {
        // Reading from Test.txt Convert caps -> small and Small -> Caps Alphabets
        try(FileInputStream fis = new FileInputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");
            FileOutputStream fos = new FileOutputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test3.txt");)
        {        
            int x;
            while((x=fis.read())!=-1)
            {
                int y;
                if(x>=65 && x<=90)
                {
                    y = x+32;
                    fos.write((byte)y);
                }
                else if(x>=97 && x<=122)
                {
                    y = x-32;
                    fos.write((byte)y);
                }
                else
                {
                    fos.write((byte)x);
                }
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        // Merging two file without overwrite
        try
        {
            FileInputStream fis1 = new FileInputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");
            FileInputStream fis2 = new FileInputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test3.txt");
            FileOutputStream fos1 = new FileOutputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Merged.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

            
            int b;
            while((b=sis.read())!=-1)
            {
                fos1.write(b);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos1.close(); 
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        // Reading file content Merged.txt
        try(FileReader fr = new FileReader("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Merged.txt");)
        {
            int x;
            while((x=fr.read())!=-1)
            {
                System.out.print((char)x);
            }
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
