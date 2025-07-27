package MutiThreading;

class Print implements Runnable{
    public void run()
    {
        int i=0;
        while(i<=10)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class PrintUsingRunnable {
    public static void main(String[] args) 
    {
        Print p = new Print();
        Thread t1 = new Thread(p);
        t1.start();
        int i = 1;
        while(i<=10)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
