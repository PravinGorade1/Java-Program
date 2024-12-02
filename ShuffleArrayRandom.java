/*10)	 Write a Java program to shuffle a given array of integers. 
(to shuffle an array using the Fisher-Yates algorithm also you can 
use Random class from java.util.*;  package and their methods)
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3] */

import java.util.*;
class Shuffle
{
	int a[];
	 void setArray(int a[])
	{
		this.a = a;
	}
	int[] getArray()
	{
		Random r = new Random();
		for(int i=0;i<a.length;i++)
		{
			int j = r.nextInt(i+1);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	}
}

class ShuffleArrayRandom
{
	public static void main(String x[])
	{
	int a[] = new int[]{1,2,3};
		Shuffle s1 = new Shuffle();
		s1.setArray(a);
		s1.getArray();
		System.out.printf("Shuffle array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
}
