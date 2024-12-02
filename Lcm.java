import java.util.*;
public class Lcm
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.printf("enter first number");
		int num1=abc.nextInt();
		
		System.out.printf("enter second number");
		int num2=abc.nextInt();
		 int a=num1>num2?num1:num2;
		 int i=a;
		
		while(i<=num1*num2)
		{
			if(i%num1==0 && i%num2==0)
			{
				System.out.print(i);
				break;
			}
			i=i+a;
		}
	}
}
		
		