import java.util.*;
import java.lang.*;
public class BinaryToDecimal
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.printf("enter the number");
		int no = abc.nextInt();
		int sum = 0;
		int p = 1;
		while(no!=0)
		{
			int rem = no % 10;
			no = no / 10;
			sum = sum + rem * p;
			p  = p * 2;
		}
		System.out.printf("%d",sum);
	}
}