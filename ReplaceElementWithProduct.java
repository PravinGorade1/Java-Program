import java.util.*;
public class ReplaceElementWithProduct
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a[] = new int[7];
		
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = abc.nextInt();
		}
		int c=a.length;
		int b[] = new int[c];
		int k=0;
		System.out.println();
		System.out.printf("\nproduct is\n");
		for(int i=0;i<a.length;i++)
		{
			int pro=1;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
				    pro=pro*a[j];
				}	
			}
			b[k++]=pro;
		}

         for(int i=0;i<b.length;i++)
		 {
           System.out.printf("%d\t",b[i]);
		 }
	}
}	