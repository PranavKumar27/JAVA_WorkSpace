package MutiThreading;

class ATM
{
    static int bal = 5000;
    public int getBalance(String name)
    {
        synchronized (this) 
        {
            System.out.println("Check Balance of " + name );
            try{ Thread.sleep(1000);}
            catch(Exception e) {e.printStackTrace();}
            System.out.println(bal + " INR " );
            return bal;
        }
    }
    synchronized public void withdraw(int amt,String name)
    {
        System.out.println("Amont Withdrawing done by " + name);
        try{ Thread.sleep(1000);}
        catch(Exception e) {e.printStackTrace();}
        System.out.println("Amount Remaining = "+(bal-amt) );
        System.out.println("-----------------------------");
    }
}

class Customer extends Thread
{
    ATM myAtm;
    String name;
    int Amount;
    public void run()
    {
        useATM();
    }

    public Customer(ATM atm, String name,int InitAmt) 
    {
        myAtm = atm;
        this.name = name;
        Amount = InitAmt;
    }
    public void useATM()
    {
        int bal = myAtm.getBalance(name);
        myAtm.withdraw(Amount,name);
    }
}

public class ATM_Synchronization {
    public static void main(String args[])
    {
        ATM Hdfc = new ATM();

        Customer c1 = new Customer(Hdfc,"Rahul", 100);
        Customer c2 = new Customer(Hdfc,"Sunny", 800);

        c1.start();
        c2.start();
        
    }
}
