import java.util.*;
public class RecursionPrime
{
	public static void main(String x[])
	{
			Scanner abc = new Scanner(System.in);
			int no;
			System.out.printf("enter the number");
			no = abc.nextInt();
			
			prime(no);
	};
}
		public static int prime(int no)
		{
			int count=0;
			if(no!=0)
			{
				int i=1;
				if(i<=no)
				{
					if(no%i==0)
					{
						count++;
					}
				}
				i++;
				prime(no);
			}
			if(count==2)
			{
				System.out.printf("prime");
			}
			else{
			  System.out.printf(" not prime");
			}
	}

