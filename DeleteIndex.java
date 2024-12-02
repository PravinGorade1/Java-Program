import java.util.*;
public class DeleteIndex
{
	public static void main(String x[])
	{
		Scanner k = new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.printf("enter the Delete index");
		int index=k.nextInt();
		
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=k.nextInt();
		}
		
		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
}