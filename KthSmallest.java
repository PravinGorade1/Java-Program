import java.util.*;
public class KthSmallest
{
	public static void main(String x[])
	{
		int size;
		int no;
		Scanner xyz = new Scanner(System.in);
		System.out.printf("enter the size of the array");
		size=xyz.nextInt();
		int a[] = new int[size];
        
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
	    for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d",a[i]);
		}
		
		System.out.println("\nremove duplicate\n");
		System.out.printf("%d\n",a[0]);
		
		int count=1;
		for(int i=1;i<a.length;i++)
		{
		  if(a[i]!=a[i-1])
		  {
            System.out.printf("%d\n",a[i]);
			count++;
		  }			  
		}
		
		System.out.printf("\nenter the number to find\n");
		no=xyz.nextInt();
		System.out.printf("\nKth largest=%d\n",a[count-no]);
	}
}