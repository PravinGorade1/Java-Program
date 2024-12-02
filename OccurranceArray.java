import java.util.*;
public class OccurranceArray
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
		
		boolean[] counted = new boolean[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if (!counted[i]) {
			  int count=0;
			 for(int j=0;j<a.length;j++)
			 {
				if(a[i]==a[j])
				{
					count++;
					counted[j] = true;
				}
			 }
			   System.out.printf("%d--->%d\n",a[i],count);
			}
		}
	}
}