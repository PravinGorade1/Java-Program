public class HollwInvertedHalfPyramid
{
	public static void main(String x[])
	{
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<7;j++)
			{
				if(i==1 || j==7-i || j==1)
				{
					System.out.printf("*");
				}
				else{
				     System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}