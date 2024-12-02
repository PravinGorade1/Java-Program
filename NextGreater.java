/*7)	Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
There is no element next to the last element, therefore replace it with -1. 

Input- Original Array 
[45, 20, 100, 23, -5, 2, -6]
Output- The modified array:
[100, 100, 23, 2, 2, -6, -1]*/
import java.util.*;
public class NextGreater
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		
		int max=a[a.length-1];
		a[a.length-1]=-1;
		for(int i=a.length-2;i>=0;i--)
		{
			int temp = a[i];
			  a[i] = max;
			  if(temp>max)
			  {
				  max=temp;
			  }
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
