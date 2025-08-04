package StreamsInJava.Serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Student
{
    int roll;
    String name;
    String branch;
    Float Percentage;

    Student(){}
    Student(int r,String n,String b,float p)
    {
        roll = r;
        name = n;
        branch = b;
        Percentage = p;
    }
}

class WriteDataClass
{
    public void writing(Student S) throws Exception
    {
        try(FileOutputStream fos = 
        new FileOutputStream("StudentObjDataStream.txt");
        DataOutputStream dos = new DataOutputStream(fos);)
        {
            dos.writeInt(S.roll);
            dos.writeUTF(S.name);
            dos.writeUTF(S.branch);
            dos.writeFloat(S.Percentage);
            System.out.println("Data Written in File");
        }
        catch(FileNotFoundException e) { System.out.println(e); }
        catch(Exception e) { System.out.println(e); }
    }
}
class ReadDataClass
{
    public void reading(Student S) throws Exception
    {
        FileInputStream fis = new FileInputStream("StudentObjDataStream.txt");
        DataInputStream dis = new DataInputStream(fis);

        // If order of Retrieving Values is changes 
        // Error is thrown as java.io.EOFException
        S.roll = dis.readInt();
        S.name = dis.readUTF();
        S.branch = dis.readUTF();
        S.Percentage = dis.readFloat();

        fis.close();
        dis.close();
    }
}

public class DataStreamSaveObject {
    public static void main(String[] args) throws Exception
    {
        Student S = new Student(2,"Ravi","Computer Science and Engineering",9.34f);

        WriteDataClass w = new WriteDataClass();
        w.writing(S);

        ReadDataClass r = new ReadDataClass();
        r.reading(S);

        System.out.println("roll = "+S.roll + " name = "+S.name+ " branch = "+S.branch + " CGPA/Percantage = "+S.Percentage);
    }
}
