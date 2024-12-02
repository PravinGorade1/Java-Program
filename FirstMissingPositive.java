import java.util.*;
public class FirstMissingPositive
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.printf("enter the size of the array");
		int size = abc.nextInt();
		int a[] = new int[size];
		 boolean f=false;
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = abc.nextInt();
		}
		 // 1 3 5 7 9 -> 2
		System.out.println("\n missing is = ");
		int k=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.println(" "+j);
				
				 f=true;
				break;
			}
			  if(f)
				 break;
		}
	}
}