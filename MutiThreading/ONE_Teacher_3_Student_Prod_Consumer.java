package MutiThreading;

class WhiteBoard
{
    String data;
    int count = 0; //  O means Teacher is writing
    int noOfStudents;

    WhiteBoard(int n)
    {
        noOfStudents = n;
    }
    synchronized String getData()
    {
        try
        {
            while(count==0) // Producer is Using
                wait();
        
            Thread.sleep(1000);
            count = count-1;
            notify();
        }
        catch(Exception e)
        { System.err.println(e);}
        return data;
    }
    synchronized void setData(String s)
    {
        try
        {
            while(count!=0)
                wait();
            
            data = s;
            Thread.sleep(1000);
            //System.out.println("Producer = "+data);
            count = noOfStudents;
        }
        catch(Exception e)
        { System.err.println(e);}
    }
}

class Teacher extends Thread
{
    String data;
    WhiteBoard W;
    String Arr[];

    public Teacher(WhiteBoard wh ,String A[]) 
    { 
        W = wh; 
        Arr = A;
    }

    public void run()
    {
        for(String s:Arr)
        {
            W.setData(s);
            System.out.println("Teacher Wrote = "+ s);  
            if(s.equals("END"))
                break; 
        }
    }
}

class Student extends Thread
{
    String name;
    WhiteBoard W;

    public Student(WhiteBoard wh,String nm)
    {
        W = wh;
        name = nm;
    }

    public void run()
    {
        while (true) 
        { 
            String S = W.getData();
            System.out.println(name + " Copied = " + S); 
            if(S.equals("END"))
                break;    
        }
    }
}

public class ONE_Teacher_3_Student_Prod_Consumer {
    public static void main(String[] args) 
    {
        int noOfStudents = 4;
        WhiteBoard W = new WhiteBoard(noOfStudents);
        String Arr[] = {"Java is OOPS Language", "Java is fun" , "Multithreading is Amazing","END"};
        Teacher T = new Teacher(W, Arr);
        Student S1 = new Student(W,"1 Rahul");
        Student S2 = new Student(W,"2 Sunil");
        Student S3 = new Student(W,"3 Raju");
        Student S4 = new Student(W,"4 Ravindra");

        T.start();
        S1.start();
        S2.start();
        S3.start();
        S4.start();

    }
}
