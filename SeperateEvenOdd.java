import java.util.*;
public class SeperateEvenOdd
{
	public static void main(String x[])
	{
		Scanner k = new Scanner(System.in);
		int a[] = new int[5];
		System.out.printf("enter the element of the array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=k.nextInt();
		}
		System.out.printf("even\n");
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]%2==0)
		    {
		      System.out.printf("%d ",a[i]);
			}
		}
		
		System.out.printf("odd\n");
		for(int j=0;j<a.length;j++)
		{
		  if(a[j]%2!=0)
		    {
		      System.out.printf("%d ",a[j]);
			}
		}
	}
}