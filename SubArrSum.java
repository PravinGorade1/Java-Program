import java.util.*;
class Sum
{
	private int a[];
	private int value;
	Sum(int a[],int value)
	{
		this.a=a;
		this.value=value;
	}
	void FindSubarr()
	{
		int sum;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==value)
				{
				  System.out.println(i+"\t"+j);
				}				
			}
		}
	}
}
   
   public class SubArrSum
   {
	   public static void main(String x[])
	   {
		   int value;
		   Scanner xyz = new Scanner(System.in);
		   int a[] = new int[6];
		   System.out.printf("enter the element");
		   for(int i=0;i<a.length;i++)
		   {
			   a[i] = xyz.nextInt();
		   }
		   
		   System.out.printf("enter the value");
		   value = xyz.nextInt();
		   Sum s =new Sum(a,value);
		   s.FindSubarr();
	   }
   }