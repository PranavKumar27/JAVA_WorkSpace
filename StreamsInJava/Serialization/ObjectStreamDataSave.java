package StreamsInJava.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// IMP  --> implements interface Serializable 
class Student implements Serializable
{
    int roll;
    String name;
    String branch;
    Float Percentage;
    boolean Pass;
    public static String CollegeName = "SIT TUMKUR";
    public transient int NoOfSubjects;

    Student(){}
    Student(int r,String n,String b,float g,boolean p)
    {
        roll = r;
        name = n;
        branch = b;
        Percentage = g;
        Pass = p;
        NoOfSubjects = (branch.equals("CSE"))?100:70;
    }

    @Override
    public String toString()
    {
        return "\n roll = "+roll + "\n name = "+name+ "\n branch = "+branch + "\n CGPA/Percantage = "+Percentage + "\n IsPass = "+Pass + "\nTransient No Of Subjects = "+NoOfSubjects + "\nStatic Alma Matar = "+CollegeName;
    }
}


class ObjectWrite
{
    public void writer(Student S)
    {
        try( FileOutputStream fos = new FileOutputStream("D:\\Java WorkSpace\\JAVA_WorkSpace\\StreamsInJava\\Serialization\\ObjectData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);)
        {
            oos.writeObject(S);
        }
        catch(FileNotFoundException e) { e.printStackTrace(); }
        catch(Exception e) { System.err.println("Unknown Exception = "+e);}
        
    }
}

class ObjectRead
{
    public Student read()
    {
        try(FileInputStream fis = new FileInputStream(("D:\\Java WorkSpace\\JAVA_WorkSpace\\StreamsInJava\\Serialization\\ObjectData.txt"));ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            Student S = (Student)ois.readObject();
            return S;
        }
        catch(FileNotFoundException e) { e.printStackTrace(); }
        catch(Exception e) { System.err.println("Unknown Exception = "+e);}
        return new Student();
    }
}
public class ObjectStreamDataSave {
    public static void main(String[] args) {
        
        Student S = new Student(3,"Ram","CSE",91.37f,true);
        ObjectWrite w = new ObjectWrite();
        w.writer(S);

        ObjectRead r = new ObjectRead();
        Student S2 = r.read();

        System.out.println(S2);
        System.out.println("----------------------------");
    }
}
