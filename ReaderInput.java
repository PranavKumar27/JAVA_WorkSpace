import java.util.*;

class ReaderInput
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		// System.in is an object associated with Keyboard
		
		System.out.println("Enter a Float Number:");
		// System.out is an object associated with Monitor
		String f = s.nextLine();
		System.out.println("Value Input as   "+f);
		
		s.useRadix(2);
		int v = s.nextInt();
		System.out.println(v);
	}
}
