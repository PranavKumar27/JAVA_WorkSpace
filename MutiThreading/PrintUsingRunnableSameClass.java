package MutiThreading;

public class PrintUsingRunnableSameClass implements Runnable {
    public void run()
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) 
    {
        PrintUsingRunnableSameClass p = new PrintUsingRunnableSameClass();
        Thread t1 = new Thread(p);
        t1.start();

        int i=1;
        while(i<=10)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
