import java.util.*;
import java.lang.*;
public class ArmstrongOrNot
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int no;
		System.out.printf("enter the number");
		no = abc.nextInt();
		int temp = no;
		int count = 0;
		int sum = 0;
		while(no!=0)
		{
			count++;
			no=no/10;
		}
		no=temp;
		while(no!=0)
		{
			int rem = no%10;
			no=no/10;
			int p=(int)Math.pow(rem, count);
			sum = sum + p;
		}
		no=temp;
		if(no == sum)
		{
			System.out.printf("armstrong");
		}
		else{
			System.out.printf("not armstrong");
		}
	}
}
		
		