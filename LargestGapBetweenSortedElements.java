/*12)	 Write a Java program to calculate the largest gap between sorted elements of an array of integers.  
Example:
Original array: [23, -2, 45, 38, 12, 4, 6]
Largest gap between sorted elements of the said array: 15*/

import java.util.*;
public class LargestGapBetweenSortedElements
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a[] = new int[7];
		
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = abc.nextInt();
		}
		
		System.out.printf("sort array");
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int max=0;
		for(int i=1;i<a.length;i++)
		{
				if(a[i]-a[i-1]>max)
				{
					max=a[i]-a[i-1];
				}
		}
		System.out.println();
		System.out.printf("%d",max);
	}
}