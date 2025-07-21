// package ClassAndObjects;

class Product
{
    private int item_no;
    private String name;
    private float price;
    private short qty;
    
    public Product()
    {
        item_no = -1;
        name = "XXX";
        price = -1.1f;
        qty = -1;
    }

    public Product(int item,String s,float f,short q)
    {
        item_no = item;
        name = s;
        price = f;
        qty=q;
    }

    // No setItem() as Item_no are not set daily and set at obj creation time
    // No setName() a Name of Product doesn't change daily
    // setQty() is needed as with new stock arrival qty should change
    public float setPrice(float price)
    {
        this.price = price;
        return this.price;
    }

    public short setQty(short nQty)
    {
        qty = nQty;
        return qty;
    }

    public float getTotalPrice()
    {
        return price*qty;
    }
    public void printInvoice()
    {
        System.out.println("Item No                 :"+item_no);
        System.out.println("Item Name               :"+name);
        System.out.println("Item Price              :"+price);
        System.out.println("Item quantity           :"+qty);
        System.out.println("Total Checkout Amount   :"+getTotalPrice());
        System.out.println("######################################   ");
    }
}

class Customer
{
    private String Cust_id;
    private String name;
    private String Addr;
    private String phone;
    private String Cars[];

    public Customer(){}
    public Customer(String c,String n,String A,String p,String ...C)
    {
        Cust_id = c;
        name = n;
        Addr = A;
        phone = p;
        Cars = C;
    }

    void getCars()
    {
        for(String s:Cars)
        {
            System.out.println("Car = "+s);
        }
    }

    void setAddr(String nAddr)
    {
        Addr = nAddr;
    }

    void setPhoneNo(String nPhone)
    {
        phone = nPhone;
    }

    public void getCustomerDetails()
    {
        System.out.println("Cust Id         :"+Cust_id);
        System.out.println("Cust_name       :"+name);
        System.out.println("Cust_Addr       :"+Addr);
        System.out.println("Cust_Phone No:  "+phone);
        getCars();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ");
    }

}

public class ProducerConsumer {
    public static void main(String[] args) {
        /* 
        Product p1 = new Product(1,"AMUL-ICE-CREAM",200,(short)10);
        Product p2 = new Product(1,"Bread",20,(short)5);
        Product p3 = new Product(1,"Curd",28,(short)2);

        p1.printInvoice();
        p2.printInvoice();
        p1.printInvoice();
        */

        Product Arr[] = new Product[3];
        Arr[0] = new Product(1,"AMUL-ICE-CREAM",200,(short)10);
        Arr[1] = new Product(1,"Bread",20,(short)5);
        Arr[2] = new Product(1,"Curd",28,(short)2);

        for(Product p:Arr)
        {
            p.printInvoice();
        }


        Customer c = new Customer("123AC","Rahul","Bangalore","987456123",new String[]{" GLX Mercedes","Tata Nexon"});
        c.getCustomerDetails();
        Customer c2 = new Customer("323AC","Naveen","Bhagalpur","937456123","Audi");
        c2.getCustomerDetails();
    }
}
