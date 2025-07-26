package Exceptions;

import java.util.Scanner;

class StackUnderFlowException extends Exception
{
    public String toString()
    {
        return "-->Stack is Empty";
    }
}

class StackOverFlowException extends Exception
{
    public String toString()
    {
        return "Stack is Full-->";
    }
}

class Stack {
    final int maxSize = 5;
    static int Arr[] = new int[5];
    static int top = -1;

    public void push(int n) throws StackOverFlowException
    {
        if(top>=maxSize-1)
            throw new StackOverFlowException();

        Arr[++top] = n;
    }
    public void pop() throws StackUnderFlowException
    {
        if(top==-1)
            throw new StackUnderFlowException();
        top--;
    }
    public int top() throws StackUnderFlowException
    {
        if(top==-1)
            throw new StackUnderFlowException();
        return Arr[top];
    }

}

public class StackImpl
{
    public static void main(String args[])
    {
        Stack S = new Stack();
        
        Scanner sc = new Scanner(System.in);

        int opt = 4;
        do
        {
            System.out.println("Enter 1 to push\n 2 to pop\n 3 to see top\n 4 to exit");
            opt = sc.nextInt();

            try
            {
                switch(opt)
                {
                    case 1: System.out.println("Enter the no to push");
                            int val = sc.nextInt();
                            S.push(val);
                            break;
                    case 2: S.pop();
                            break;
                    case 3: System.out.println("top = "+S.top());
                            break;
                    case 4: System.out.println("Exitiing");
                            break;
                    default:System.out.println("Enter options Correctly");
                }
            }
            catch(StackOverFlowException e)
            {
                System.err.println(e);
            }
            catch(StackUnderFlowException e)
            {
                System.err.println(e);
            }
            
        }while(opt!=4);
        
    }
}
