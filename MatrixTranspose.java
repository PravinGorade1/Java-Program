
public class MatrixTranspose
{
	public static void main(String x[])
	{
		int a[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d",a[j][i]);
			}
			System.out.println();
		}
	}
}