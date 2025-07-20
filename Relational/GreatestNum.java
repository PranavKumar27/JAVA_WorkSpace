public class GreatestNum
{
    public static void main(String args[])
    {
        int a = 2,b=5,c=10;

        System.out.println(a<b && b<c);

        if(a>b && a>c)
        {
            System.out.println("a ="+a);
        }
        else
        {
            // a is not greatest so compare only b and c
            if(b>c)
                System.out.println("b="+b);
            else
                System.out.println("c="+c);
        }
    }
}