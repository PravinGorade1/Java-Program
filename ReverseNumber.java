import java.util.*;
public class ReverseNumber
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.printf("enter the number");
		int no = abc.nextInt();
		int rem = 1;
		int rev = 0;
		while(no!=0)
		{
			 rem = no % 10;
			 no = no / 10;
			 rev = rev * 10 + rem;
		}
		System.out.printf("%d",rev);
	}
}