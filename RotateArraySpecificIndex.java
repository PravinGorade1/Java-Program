import java.util.*;
public class RotateArraySpecificIndex
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = abc.nextInt();
		}
		System.out.printf("enter the index");
		int pos = abc.nextInt();
		
		int b[] = new int[6];
		int k=0;
		System.out.printf("Rotate Array At Specific Index");
		for(int i = a.length-pos;i<a.length;i++)
		{
			b[k++] = a[i];
		}
		
		for(int i = 0;i<a.length-pos;i++)
		{
			 b[k++] = a[i];
		}
		
		for(int i = 0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
	}
}