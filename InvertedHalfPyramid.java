public class InvertedHalfPyramid
{
	public static void main(String x[])
	{
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<7;j++)
			{
				if(j<=7-i)
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