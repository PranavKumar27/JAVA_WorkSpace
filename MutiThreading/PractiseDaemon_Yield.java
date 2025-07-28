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
            System.out.println(i+" MyThread");
            i++;
        }
    }
}

public class PractiseDaemon_Yield {
    public static void main(String[] args) throws Exception
    {
        MyThread t1 = new MyThread("t1");   
        t1.setDaemon(true);
        t1.start(); 


        int i = 1;
        while (true) 
        { 
            System.out.println(i+" Main Thread");
            i++;
            // Give more time to Mythread since it is startving
            Thread.yield();
        }
    }
}

