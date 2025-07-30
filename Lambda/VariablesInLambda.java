// package Lambda;

interface MyLambda
{
    public void display();
}

class UseLambda
{
    void InUseLambda(MyLambda m1)
    {
        m1.display();
    }
}
class Demo
{
    public void method1()
    {
        final int count1 = 0;// Either declare final and do not modify
        float temp = 12.3f;
        MyLambda m1 = ()->{ 
                            int count = 0;
                            count++;
                            // count1++;
                            System.out.println("Hi");
                            System.out.println("Hello");
                            System.out.println("count = "+count + " count1 = "+ count1);
                            System.out.println("temp = "+temp );
                        };
        m1.display();
        // count1++;

        UseLambda ul = new UseLambda();
        MyLambda  m4 = ()->{ System.out.println("XXLambdaYY");};
        ul.InUseLambda(()->{ System.out.println("XXXLambdaYYY");});
    } 
}
public class VariablesInLambda {
    public static void main(String[] args) 
    {
        Demo d = new Demo();
        d.method1();    

        


        
    }
}
