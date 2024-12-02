import java.util.*;
public class TwoDimensionalArray
{
	public static void main(String x[])
	{
		int a[][]=new int[3][3];
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the value in array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		System.out.println("Display Array value");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
		