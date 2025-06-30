import java.util.*;

class Calculator
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int a=0,b=0,c=0;
		System.out.println("Enter 2 Nos");
		if(s.hasNextInt())
			a = s.nextInt();
		if(s.hasNextInt())
			b = s.nextInt();
		c = a+b;
		System.out.println("Sum = "+c);
	}
}
