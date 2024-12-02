import java.util.*;
public class LnearSearch
{
	public static void main(String x[])
	{
		Scanner xz= new Scanner(System.in);
		int size;
		int seval;
		int flag=0;
		System.out.println("enter the size of the array");
		size=xz.nextInt();
		
		System.out.printf("enter the search value");
		seval=xz.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xz.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
				if(seval==a[i])
				{
				   flag=1;
				   break;
				}
		}
		if(flag==1)
		{
		   System.out.printf("value find");
		}
		else{
			  System.out.printf("value not find");
		   }

	}
}