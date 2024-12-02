import java.util.*;
import java.lang.Math;
public class DecimalTOBinary
{
	public static void main(String x[])
	{
		int no;
		Scanner k = new Scanner(System.in);
		System.out.printf("enter the number");
		no=k.nextInt();
		int count=0;
		int sum=0;
		while(no!=0)
		{
			int rem=no%2;
			no=no/2;
			int p=(int)Math.pow(10,count);
			sum=sum+rem*p;
			count++;
		}
		System.out.printf("%d",sum);
	}
}