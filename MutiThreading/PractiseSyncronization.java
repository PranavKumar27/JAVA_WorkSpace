// package MultiThreading;

class DataDisplay
{
    // synchronized public void display(String Str) <----- Another way to synchronize Method
    public void display(String Str)
    {
        synchronized (this) // Allows Only Single thread inside 
        {
            // Below Code is common to all Thread - CRITICAL SECTION
            int n = Str.length();
            for(int i=0;i<n;i++)
            {
                try
                {
                    System.out.print(" " + Str.charAt(i) + " ");
                    Thread.sleep(1000); // Both Thread will sleep and print after wake
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread1 extends Thread
{
    DataDisplay SharedObj;
    Thread1(DataDisplay obj)
    {
        SharedObj = obj;
    }
    public void run()
    {
        SharedObj.display("Hello World");
    }
}

class Thread2 implements  Runnable
{
    DataDisplay SharedObj;

    public Thread2(DataDisplay obj) 
    {
        SharedObj = obj;
    }
    public void run()
    {
        SharedObj.display("Welcome");
    }
}


public class PractiseSyncronization {
    public static void main(String[] args) 
    {
        // Creating the SharedData Object to be shared among Thread1 and Thread2
        DataDisplay d1 = new DataDisplay();

        // Creating Thread from Class Thread1
        Thread1 t1 = new Thread1(d1);

        // Creating Thread from Class Thread2
        Thread2 t2 = new Thread2(d1);
        Thread Th = new Thread(t2);
        // Passing thread t2 to Runnable Thread Th

        // Thread1 to print "Hello World"
        t1.start();

        // Thread2 to print "Welcome"
        Th.start();
    }
}
