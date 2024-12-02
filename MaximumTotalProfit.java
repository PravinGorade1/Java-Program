import java.util.*;
public class MaximumTotalProfit
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a[] = new int[7];
		System.out.printf("enter the element of the array");
		
	    for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		 
	     System.out.printf("enter the bay day and sellday");
		 int no=abc.nextInt();
		 
		 int maxp =0;
		 int p[]=new int[no];
		 int q[]=new int[no];
		 System.out.printf("enter the bay");
		 for(int i=0;i<p.length;i++)
		 {
			    p[i]=abc.nextInt();
		 }
		 
		 System.out.printf("enter the sell");
		 for(int i=0;i<q.length;i++)
		 {
			    q[i]= abc.nextInt();
		 }
		 
		 for(int i=0;i<p.length;i++)
		 {
			 maxp=maxp+a[q[i]]-a[p[i]];
		 }
		 System.out.printf("\n%d",maxp);
	}
}
		
		
		
		