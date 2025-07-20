import java.lang.*;

public class CommandTest
{
	static double sumCommandLineArgs(String[] args)
	{
		double sum = 0;
		for(String s:args)
		{
			if(s.matches("[0-9\\.0-9]+"))
				sum+=Double.parseDouble(s);
			else
				{
					System.out.println("Args = " + s + " is not a Number So ignored in SUM ");
					//return -1;
				}
		}
		return sum;
	}
	public static void main(String...Args)
	{
		for(String s:Args)
			System.out.println(s);

		System.out.println("Sum of CommandLine Args = "+sumCommandLineArgs(Args));
	}
}