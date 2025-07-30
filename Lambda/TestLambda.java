// package Lambda;

// If An Interface has Single Abstract Method, it is called FunctionalInterface
// For the same we can use annotation as FunctionalInterface
// Lambda are using to define Annonymous / Nameless Methods or functions
@FunctionalInterface
interface MyLambda
{
    public void display();
}

// An Interface which has show() and takes parameter
@FunctionalInterface
interface MyLambdaWithParam
{
    //public void show(String S);

    public int add(int a,int b);
}

class NewClass implements MyLambda
{
    @Override
    public void display()
    {
        System.out.println("Hello");
    }
}

public class TestLambda {
    public static void main(String[] args) {
        
        // Creating Obj and Using  <----- Standard Technique
        NewClass n1 = new NewClass();
        n1.display();

        // Using Interface Directly <----- Defining fun in the Object itself
        MyLambda m1 = new MyLambda()
                            { 
                                public void display()
                                {
                                    System.out.println("World");
                                }
                            };
        m1.display();

        // Using Lambda , Use Interface Name <--- Using Lambda Approach of Java
        // Calling Method annonymously
        MyLambda m2 =()->{ System.out.println("World"); };
        m2.display();  

        /*
         * MyLambdaWithParam p1 = (str)->{ System.out.println(str);};
            p1.show("Java is Awesome");
         * 
         */

        MyLambdaWithParam p2 = (a,b)->{ return (a+b);};
        int c = p2.add(2, 3);
        System.out.println("Sum = "+c);

        // Without Using Return Statement it Works
        MyLambdaWithParam p3 = (a,b)->a+b;
        int c1 = p3.add(20, 30);
        System.out.println("Sum = "+c1);
        
    }
}
