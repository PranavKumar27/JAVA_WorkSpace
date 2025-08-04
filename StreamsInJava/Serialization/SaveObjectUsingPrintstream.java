package Serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student
{
    int roll;
    String name;
    String branch;

    Student(){}
    Student(int r,String n,String b)
    {
        roll = r;
        name = n;
        branch = b;
    }
}



public class SaveObjectUsingPrintstream {
    public static void main(String[] args)
    {
        try
        {
            MyWrite w = new MyWrite();
            w.writeData();

            MyRead r = new MyRead();
            r.readData();
        }
        catch(Exception e)
        {
            System.out.println("Exception = "+e);
        }

    }
}

class MyWrite
{
    void writeData() throws Exception
    {
        Student S = new Student(12,"Sunny","CSE");

        FileOutputStream fos = new FileOutputStream("ObjectData.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println(S.roll);
        ps.println(S.name);
        ps.println(S.branch);

        ps.close();
        fos.close();
    }
}

class MyRead
{
    public void readData() throws Exception
    {
        FileInputStream fis = new FileInputStream("ObjectData.txt");
        // PrintStream ps = new PrintStream(fis); <--- Can't use for Reading
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student S = new Student();
        S.roll = Integer.parseInt(br.readLine());
        S.name = br.readLine();
        S.branch = br.readLine();

        System.out.println("roll = "+S.roll + " name = "+S.name+ " branch = "+S.branch);
        
    }
}
