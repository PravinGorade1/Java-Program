/*1)Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]*/
import java.util.*;
class Array
{
	private int a[];
	private int t;
	void setarray(int []a,int t)
	{
		this.a=a;
		this.t=t;
	}
	int[] getsum()
	{
		int b[] = new int[2];
		int s=0;
	  for(int i=0;i<a.length;i++)
	  {
        for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==t)
			{
				b[s++]=a[i];
				b[s++]=a[j];
				break;
			}
		}
	  }
        return b;	  
	}
}
  public class TwoSum
  {
	  public static void main(String x[])
	  { 
	    int target;
		int size;
		Scanner xyz = new Scanner(System.in);
		System.out.printf("enter the size of the array");
		size=xyz.nextInt();
		
		int a[] = new int[size];
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.printf("enter the target value");
		target = xyz.nextInt();
		
		Array b = new Array();
		b.setarray(a,target);
		int res[]=b.getsum();
		for(int i=0;i<res.length;i++)
		{
			System.out.printf("%d\t",res[i]);
		}
	  }
  }
	
