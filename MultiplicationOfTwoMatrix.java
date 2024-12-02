import java.util.*;
public class MultiplicationOfTwoMatrix
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
	
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		System.out.printf(" enter first matrix");
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a.length;j++)
			{
			  a[i][j]=abc.nextInt();
			}
		}			
		System.out.printf(" enter second matrix");
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<b.length;j++)
			{
			  b[i][j]=abc.nextInt();
			}
		}			
		System.out.printf("multiplication is\n");
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a.length;j++)
			{
				int mul=0;
				for(int k=0;k<a.length;k++)
				{
			      mul=mul+a[i][k]*b[k][j];
				}
				c[i][j]=mul;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.println();
		}
	}
}	