import java.util.*;
public class Max
{
	public static void main(String x[])
	{
	Scanner abc = new Scanner(System.in);
	int[] a=new int[10];
	int temp=0,i,j;
	
	System.out.printf("enter the element");
	for(i=0;i<a.length;i++)
	{
	  a[i]=abc.nextInt();	
	}
	
	System.out.printf("enter the element");
	int length=abc.nextInt();
	int max=0;
	for(i=temp;i<a.length;i++)
	{
		max=0;
		for(j=temp;j<temp+length;j++)
		{
			if(max<a[j])
			{
				max=a[j];
			}
		}
	for(j=temp;j<temp+length;j++)
	{
		System.out.printf("%d\t",a[j]);
	}
	
	System.out.printf("--%d",max);
	temp++;
	System.out.printf("\n");
	}
  }
}