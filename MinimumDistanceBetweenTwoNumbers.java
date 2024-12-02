/*30) Write a program in C to find the minimum distance between two numbers in a given array. 
Expected Output: 
The given array is: 
7 9 5 11 7 4 12 6 2 11 
The minimum distance between 7 and 11 is: 1*/

import java.util.*;
public class MinimumDistanceBetweenTwoNumbers
{
	public static void main(String x[])
	{
		Scanner k = new Scanner(System.in);
		
		int a[]= new int[]{7,9,5,11,7,4,12,6,2,11};
		System.out.printf("enter the value 1");
		int value1=k.nextInt();
		System.out.printf("enter the value 2");
		int value2=k.nextInt();
		
		int count=0, min = 1000;
      for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a.length;j++)
		  {
			if(a[i]==value1 && a[j]==value2 || a[j]==value1 && a[i]==value2)
			{
				count = j-i;
				    if(count<0)
					  count=i-j;
                   if(min>count)
				   {
					    min=count;
				   }					   

			}
		  }
	  }
	  System.out.printf("%d",min);
	}
}
			