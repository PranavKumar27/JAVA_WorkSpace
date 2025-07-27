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

public class PractiseDaemon_Join {
    public static void main(String[] args) throws Exception
    {
        MyThread t1 = new MyThread("t1");   
        t1.setDaemon(true);
        t1.start(); 

        // Here Main thread will wait for Daemon thread to complete
        // Without main.join() Daemon thread is not executed
        Thread mainThreadContext = Thread.currentThread();
        mainThreadContext.join();
    }
}
