public class FullPyramidUsingFlag
{
	public static void main(String x[])
	{
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<12;j++)
			{
				if((j<=6 && j>=7-i) || (j>=7 && j<=5+i))
				{
						if(i%2==0 && j%2==0 || i%2==1 && j%2==1)
						{
							System.out.printf(" ");
						}
						else
				        {
					      System.out.printf("*");
				        }
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}