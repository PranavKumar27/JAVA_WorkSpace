// package StreamsInJava.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable
{
    transient static int count = 1;
    static final String Corp = "HRX-";
    String CustID;
    String name;
    String Phone;
    boolean Active;
    float lastBillAmount;
    int totalItemCount;

    Customer(){}

    Customer(String n,String P,boolean A,float Amt,int cnt)
    {
        CustID = Corp + count;
        count++;
        name = n; Phone = P;
        Active = A; 
        lastBillAmount = Amt;
        totalItemCount = cnt;
    }

    @Override
    public String toString()
    {
        String res = "CustID:" + CustID + "\n" + 
                     "name:" + name + "\n" +
                     "Phone:" + Phone + "\n" +
                     "lastBillAmount:" + lastBillAmount + "\n" +
                     "totalItemCount:" + totalItemCount + "\n";
        return res;
    }
}

class CustomerRegistraion
{
    Customer CArr[];
    public Customer[] register()
    {
        Customer C1 = new Customer("Sanjay","9874561235",true,123.45f,10);
        Customer C2 = new Customer("Sunil","9874561235",true,1023.45f,10);
        Customer C3 = new Customer("Rahul","9884561235",true,1203.45f,100);
        Customer C4 = new Customer("Vinay","98994561235",true,1213.45f,110);
        Customer C5 = new Customer("Ravi","9877561235",true,1231.45f,120);
        Customer C6 = new Customer("Raina","9874561235",true,12223.45f,130);
        Customer C7 = new Customer("Dhoni","9874461235",true,1223.45f,140);
        Customer C8 = new Customer("Kohli","9874861235",true,1923.45f,150);
        Customer C9 = new Customer("Abhihsek","9574561235",true,1423.45f,160);
        Customer C10 = new Customer("Shubhman","9174561235",true,1283.45f,170);
        
        Customer CArr[] = {C1,C2,C3,C4,C5,C6,C7,C8,C9,C10};
        
        return CArr;
    }
}

public class StoreAndRetrieveCustomerData {
    
    static void storeData(Customer CArr[]) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("Customer.txt");
        ObjectOutputStream Oos = new ObjectOutputStream(fos);

        int sz = CArr.length;
        Oos.writeInt(sz); // Storing Size of Arr

        for(Customer c:CArr)
        {
            Oos.writeObject(c);
        }

        Oos.close();
        fos.close();
    }

    static void RetrieveData() throws Exception
    {
        FileInputStream fis = new FileInputStream("Customer.txt");
        ObjectInputStream Ois = new ObjectInputStream(fis);

        int len = Ois.readInt();

        for(int i=0;i<len;i++)
        {
            Customer temp = (Customer)Ois.readObject();
            System.out.println(temp);
        }

        Ois.close();
        fis.close();
    }
    static void RetrieveData(String nm) throws Exception
    {
        FileInputStream fis = new FileInputStream("Customer.txt");
        ObjectInputStream Ois = new ObjectInputStream(fis);

        int len = Ois.readInt();

        for(int i=0;i<len;i++)
        {
            Customer temp = (Customer)Ois.readObject();
            if(temp.name.equals(nm))
            {
                System.out.println("Found Customer = "+temp);
                break;
            }
        }

        Ois.close();
        fis.close();
    }
    
    public static void main(String[] args) throws Exception
    {
        CustomerRegistraion Cr = new CustomerRegistraion();
        Customer CArr[] = Cr.register();

        storeData(CArr);

        RetrieveData("Raina");

        // Reading back Customer Data

        

    }
}
