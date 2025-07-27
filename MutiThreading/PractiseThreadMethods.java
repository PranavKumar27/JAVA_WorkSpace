package MutiThreading;

class MyRunnable implements Runnable
{
    public void run()
    {

    }
}

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(MAX_PRIORITY);
    }

    public void run()
    {
        int i =1;
        while(i<=100)
        {
            System.out.println("Value = "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException E)
            {
                System.out.println("Sleep On going *********************** Thread Inetrrupted");
                E.getStackTrace();
            }
            i++;
        }
    }
}
public class PractiseThreadMethods {
    public static void main(String[] args) 
    {
        /* 
        Thread t1 = new Thread(new MyRunnable()); 
        
        t1.start();
        System.out.println("t1.getId() = "+t1.getId());
        System.out.println("t1.getName() = "+t1.getName());
        System.out.println("t1.getPriority() = "+t1.getPriority());
        System.out.println("t1.getState() = "+t1.getState());
        System.out.println("t1.isAlive() = "+t1.isAlive());
        System.out.println("t1.getStackTrace() = "+t1.getStackTrace());

        */

        // Thread Creating usig extends Thread
        MyThread myt2 = new MyThread("My New Thread1");
        myt2.start();
        myt2.interrupt();
        System.out.println("myt2.getId() = "+myt2.getId());
        System.out.println("myt2.getName() = "+myt2.getName());
        System.out.println("myt2.getPriority() = "+myt2.getPriority());
        System.out.println("myt2.getState() = "+myt2.getState());
        System.out.println("myt2.isAlive() = "+myt2.isAlive());
        System.out.println("myt2.getStackTrace() = "+myt2.getStackTrace());


        
    }
}
