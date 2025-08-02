
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// package StreamsInJava;

class Producer extends Thread
{
    OutputStream Os;

    public Producer(OutputStream O) { Os = O;}
    public void run()
    {
        int cnt = 1;
        //synchronized (this) <-- Not useful as Input and Output Stream are different 
        {
            while(true)
            {
                try
                {
                    Os.write(cnt);
                    Os.flush();
                    System.out.println("Producer = "+cnt);
                    System.out.flush();
                    cnt++;
                    Thread.sleep(1000);
                }
                catch(Exception e) { e.printStackTrace();}
            }
        }
    }
}

class Consumer extends Thread
{
    InputStream Is;
    
    public Consumer(InputStream I) { Is = I;}
    public void run()
    {
        //synchronized (this) 
        {
            while (true) 
            { 
            try
                {
                    int x = Is.read();
                    if(x==-1)
                        System.out.println("Cannot read");

                    System.out.println("Consumer = "+x);
                    System.out.flush();
                    Thread.sleep(1000);
                }
                catch(Exception e) { System.out.print(e);}
            }
        }
         
    }
        
}

public class ProducerConsumerUsingPipes {
    public static void main(String[] args) throws Exception
    {
        PipedInputStream Pis = new PipedInputStream();
        PipedOutputStream Pos = new PipedOutputStream();

        Pis.connect(Pos);

        Consumer c = new Consumer(Pis);
        Producer p = new Producer(Pos);

        c.start();
        p.start();

        c.join();
        p.join();
        Pis.close();
        Pos.close();
    }
}
