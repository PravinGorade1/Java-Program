import java.util.*;
public class Exe
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the two value");
		a = abc.nextInt();
		b = abc.nextInt();
		try{	
			c = a/b;
			System.out.printf("%d",c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Second value should not zero");
			System.out.println("error is"+ex);
		}
		System.out.println("logic1");
		System.out.println("logic2");
		System.out.println("logic3");
	}
}