package MutiThreading;

public class PrintInSameClass extends Thread{

    public void run()
    {
        int i = 1;
        while (i<10) 
        { 
            System.out.println(i+" Hello ");
            i++;
        }
    }
    public static void main(String[] args) 
    {
        Test t = new Test();
        t.start();
        
        int i=1;
        while (i<10) 
        { 
            System.out.println(i+" World");
            i++;    
        }
    }
}

