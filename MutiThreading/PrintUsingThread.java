package MutiThreading;

class Test extends Thread
{
    public void run()
    {
        int i = 1;
        while (i<10) 
        { 
            System.out.println(i+" Hello ");
            i++;
        }
    }
}

public class PrintUsingThread {
    public static void main(String[] args) 
    {
        Test te = new Test();
        /*
         * Thread t1 = new Thread(te);
            t1.start();
         */
        te.start();
        
        int i=1;
        while (i<10) 
        { 
            System.out.println(i+" World");
            i++;    
        }
    }
}
