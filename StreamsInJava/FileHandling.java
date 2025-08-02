// package StreamsInJava;

import java.io.File;
import java.io.FileOutputStream;

public class FileHandling {
    public static void main(String[] args) throws Exception
    {
        File f = new File("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/ALPHABETS.txt");

        f.setReadable(true);  // If set Readable , we can't write 
        f.isHidden();
        FileOutputStream fos = new FileOutputStream("D:/Java WorkSpace/JAVA_WorkSpace/StreamsInJava/ALPHABETS.txt");

        fos.write(11); // error since setReadable
        System.out.println((char));



        String path = f.getAbsolutePath();
        System.out.println("Path = "+path);

        System.out.println("Is Directory = "+f.isDirectory());

        String list[] = f.list();

        for(String x:list)
        {
            System.out.println("files = "+x);

        }


        File list1[] = f.listFiles();
        f.setReadOnly();

        for(File x:list1)
        {
            System.out.print("files = "+x.getName());
            FileOutputStream fos = new FileOutputStream(x);
            System.out.println(" Path = "+x.getPath());
        }
        

    }
}
