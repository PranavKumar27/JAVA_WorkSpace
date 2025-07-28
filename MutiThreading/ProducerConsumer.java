package MutiThreading;

class MyData
{
    int value;
    static boolean flag = true; // Producer

    synchronized public int getValue() // to be called by Consumer
    {
        try
        {
            while(flag==true)
                wait();
            
            Thread.sleep(1000);
            System.out.println("Data Consumed By Consumer = "+value);
            flag = true; // Ready for Producer Again
            notify();
            

        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        return value;
    }

    synchronized public void setValue(int d)
    {
        try
        {
            while(flag == false) // Consumer is accessing
                wait();

            Thread.sleep(1000);
            value = d;
            System.out.println("Data Put By Producer = "+value);

            flag=false; // Ready for Consumer
            notify();
        }
        catch(Exception e)
        {
            System.err.println(e);
        } 
    }
}

class Producer extends Thread
{
    MyData SharedObj;

    public Producer(MyData P) 
    {
        SharedObj = P;
    }

    public void run()
    {
        int i = 1;
        while (true) 
        { 
            SharedObj.setValue(i);
            i++;
        }
    }
}

class Consumer extends Thread
{
    MyData SharedObj;
    Consumer(MyData d)
    {
        SharedObj = d;
    }
    public void run()
    {
        while (true) 
        { 
            int v = SharedObj.getValue();
            System.out.println("Value = "+v);    
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) 
    {
        MyData SharedData = new MyData();

        Producer Prod = new Producer(SharedData);
        Consumer Cons = new Consumer(SharedData);

        Prod.start();
        Cons.start();
    }
}
