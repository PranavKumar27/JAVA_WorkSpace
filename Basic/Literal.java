import java.lang.*;

class Literal
{
	public static void main(String args[])
	{
		byte b1 = 15;
		byte b2 = 0b1111; // Binary Number
		byte b3 = 017; // Octal Number
		byte b4 = 0xF; // HexaDecimal
		
		System.out.println("b1="+b1+" b2="+b2+" b3="+b3+" b4="+b4);
		
		
		long val = 99999; // the number 99999 is treated as int
		//long value = 99999999999; // This has compilation error as integer number too large
		
		// To fix this write as 
		long value = 99999999999L;
		
		System.out.println(value);
		
	
		
		// Storing Long inside Integer
		//int valueInt = 999L; // Compilation Error incompatible types: possible lossy conversion from long to int
		
		//System.out.println(valueInt);
		
		
		//float f = 12.56;// Compilation Error incompatible types: possible lossy conversion from double to float
		
		// By Default All will be double type 
		float f1 = 1_2.56f;
		
		double d=12.56;
		
		// For large Number
		long s = 999_999_999L;
		System.out.println("s = "+s);
		
	}
}
