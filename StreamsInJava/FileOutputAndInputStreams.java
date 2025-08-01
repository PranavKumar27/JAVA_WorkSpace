import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputAndInputStreams {
    public static void main(String Args[])
    {
       
        // Can Also use try with Resources as
        // try(FileOutputStream fos = new FileOutputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");)
        try
        {
            FileOutputStream fos = new FileOutputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");
            String str = "Learning Java is Fun";

             // Type 1 to Write in File
            fos.write(str.getBytes());

            

            // Type2 to write in a file

            String str2 = "\n Java is powerful Language\n";
            byte bArr[] = str2.getBytes();

            for(byte b:bArr)
                fos.write(b);

            
            // Type 3 Copy Only the some text as below
            // str     --> Learning Java is Fun
            // Copy as -->          Java is Fun

            byte bArr2[] = str.getBytes();
            fos.write(bArr2, 9, str.length()-9);


            // Free Resources, Also we can use try-with-resources 
            // then no need to call close 
            
             fos.close(); // Close for File Stream

             // Write using FileWriter
             // Refer Next program

            

           
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Excpetion 1 --> " + e);
        }
        catch(IOException e)
        {
            System.out.println("Excpetion 2 --> " + e);
        }

        // Reading from the File

        try(FileInputStream fis = new FileInputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");)
        {
            // Type 1 : Read from File Read in byte array
            byte bOutput[] = new byte[fis.available()]; 
            fis.read(bOutput);
            // Can't use toString() on Byte Array
            String sOut = new String(bOutput);
            System.out.println("Read from File ---> \n "+sOut);

            // Type 2 : Read from File Read byte-by-byte

            FileInputStream fis2 = new FileInputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/Test.txt");
            
            int x;
            
            System.out.println("Read from File Using FileInputStream & Ascii -->  ");
            do
            {
                x = fis2.read();
                if(x!=-1) // -1 is returned when End of file is reached
                    System.out.print((char)x);
            }while(x!=-1);
            System.out.println();
            fis2.close();


            // Type 3 Read usng FileReader
            // Refer Next Program

            
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
