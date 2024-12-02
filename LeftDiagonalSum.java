public class LeftDiagonalSum
{
	public static void main(String x[])
	{
		int a[][] = new int[][]{{2,3},{5,6}};
		System.out.printf("matrix is\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("%d",a[i][j]);
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				sum+=a[i][j+(a.length-i-1)];
			}
		}
		System.out.printf("%d",sum);
	}
}