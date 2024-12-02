/*31) Write a program in C to rearrange positive and negative numbers alternatively in a given array 
? 
Output: 
If positive numbers are more they appear at the end and for also negative numbers, they too appear 
in the end of the array. 
Expected Output: 
The given array is: -4,8,-5,-6,5,-9,7,1,-21,-11,19	 
The rearranged array is: -4 7 -5 1 -21 5 -11 8 -9 19 -6*/

public class RearrangePositiveAndNegative
{
	public static void main(String x[])
	{
		int a[] = new int[]{-4,8,-5,-6,5,-9,7,1,-21,-11,19};
		int n=a.length;
		int pos[] = new int[n];
		int neg[] = new int[n];
		
		int p=0,q=0,k=0;
		for(int value:a)
		{
			if(value>=0)
			{
				pos[p++]=value;
			}
			else{
				neg[q++]=value;
			}
		}
		k=0;
		p=0;
		q=0;
		int flag = 0;
		while(k<a.length)
		{
			if(flag == 1)
			{
				a[k++]=pos[p++];
				flag = 0;
			}
			else
			{
				a[k++]=neg[q++];
				flag = 1;
			}
		}
		for(int m=0;m<k;m++)
		{
			System.out.printf("%d\t",a[m]);
		}
	}
}