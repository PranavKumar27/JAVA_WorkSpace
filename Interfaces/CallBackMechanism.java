// package Interfaces;

// This is a very Important Program to learn

interface  Member
{
    void callback();
}

class Customer implements Member
{
    String name;
    Customer() {}
    Customer(String s) {name = s;}

    void rating()
    {
        System.out.println( " Stars = "+(Math.random()*100)%5);
    }
    public void callback()
    {
        System.out.println("Thanks, I have received Call from Store - From " + name);
    }
}
class Store
{
    Member M[] = new Member[5];
    int cnt = 0;
    void register(Member m)
    {
        M[cnt++] = m;
    }
    void newShop()
    {
        for(int i=0;i<cnt;i++)
        {
            M[i].callback();
            //M[i].rating();
        }
            
    }
}

public class CallBackMechanism {
    public static void main(String[] args) 
    {
        Customer c1 = new Customer("John");
        Member c2 = new Customer("Henry");
        c1.rating();
        // c2.rating();

        Store S = new Store();
        S.register(c1);
        S.register(c2);

        S.newShop();

    }
}
