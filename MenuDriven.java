import java.util.*;
public class MenuDriven
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter the value in array");
		int a[] = new int[5];
		int i=0;
		for(i=0;i<a.length;i++)
		{
			a[i] = abc.nextInt();
		}
		System.out.println("enter your choice: ");
		System.out.println("1: reverse all numbers");
		System.out.println("2: sort all number in asending order");
		System.out.println("3: sort all number in descending order");
		ch = abc.nextInt();
		
		switch(ch)
		{
			case 1:
			  for(i=0;i<a.length;i++)
			  {
				  n=a[i];
				  rev=0;
				  rem=0;
				 while(new!=0)
				 {
					 rem=n%10;
					 n=n/10;
					 rev=rev*10+rem;
				 }
                     a[i]=rev;				 
			  }
			  break;
		   }
    for(i=0;i<a.length;i++)
     	{
		System.out.println(a[i]+"\t");
		}
	}
}