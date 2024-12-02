import java.util.*;
public class PrimeOrNot
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int no;
		System.out.printf("enter the number");
		no = abc.nextInt();
		int count=0;
			int i=1;
			while(i<=no)
			{
				if(no%i == 0)
				{
			  	 count++;
				}
				i++;
			}
         if(count == 2)
		 {
			System.out.printf("prime");
		 }
		 else{
			 System.out.printf("not prime");
		 }
	}
}