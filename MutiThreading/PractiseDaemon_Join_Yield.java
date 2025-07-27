package MutiThreading;

class MyThread extends Thread
{

    public MyThread(String n) {
        super(n);
    }
    
    public void run()
    {
        int i = 1;
        while (true) 
        { 
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class PractiseDaemon_Join_Yield {
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread("t1");   
        t1.setDaemon(true);
        t1.start(); 

        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            System.err.println("Interupted = "+e);
        }
    }
}
