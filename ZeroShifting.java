import java.util.*;
public class ZeroShifting
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int[5];
		System.out.printf("enter the element of the array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] =xyz.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
		  {
               if(a[i]==0 && a[j]!=0)
			   {
				  int temp=a[i];
                      a[i]=a[j];
                      a[j]=temp;					  
			   }
		  }
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
}	
		
	
		