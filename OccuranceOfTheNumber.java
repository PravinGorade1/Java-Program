import java.util.*;
public class OccuranceOfTheNumber
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int size;
		
		System.out.printf("enter the size");
		size = abc.nextInt();
		int a[] = new int[size];
		
		System.out.printf("enter the element of the array");
		for(int i = 0;i<a.length;i++)
		{
			a[i] = abc.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)
		{
			int count=1;
		  	for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				System.out.printf("\n%d--->%d",a[i],count);
			}
		}
		
	}
}