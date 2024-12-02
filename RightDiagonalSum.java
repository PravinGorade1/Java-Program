public class RightDiagonalSum
{
	public static void main(String x[])
	{
		int a[][] = new int[][]{{1,4},{4,4}};
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d",a[i][j]);
			}
			System.out.println();
		}
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					sum += a[i][j];
				}
			}
		}
		System.out.printf("%d",sum);
	}
}