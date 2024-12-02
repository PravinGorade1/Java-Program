import java.util.*;
public class MissingApp
{
	public static void main(String x[])
	{
		int a[]= new int[5];
		Scanner xyz = new Scanner(System.in);
		System.out.printf("enter the value in the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		int n=1;
		int i=0;
		
		while(i<a.length)
		{
			while(n!=a[i])
			{
				System.out.printf("%d",n);
				n++;
			}
			n++;
			i++;
		}
   }
}
	