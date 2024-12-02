import java.util.*;
public class MatrixRowAndColumnSum
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a[][]= new int[2][2];
		
		System.out.printf("enter the element of the first array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=abc.nextInt();
			}
			
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
					sum=sum+a[i][j];
					System.out.printf("%d",a[i][j]);
			}
			System.out.printf("=%d\t",sum);
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int sum1=0;
			for(int j=0;j<a.length;j++)
			{
					sum1=sum1+a[j][i];
			}
			
			System.out.printf("%d",sum1);
		}
		
	}
}