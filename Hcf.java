import java.util.*;
public class Hcf
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.printf("enter the first number");
		int num1=abc.nextInt();
		
		System.out.printf("enter the second number");
		int num2=abc.nextInt();
		
		int gcd=0;
		int i=1;
		while(i<=num1 && i<=num2)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
			i++;
		}
		System.out.printf("%d",gcd);
	}
}
		