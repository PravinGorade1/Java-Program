public class PatternApp
{
	public static void main(String x[])
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i<5)
				{
					if(j>=4-i && j<=8-i)
					{
						System.out.printf("*");
						
					}
					else
					{
						System.out.printf("  ");
					}
				}
				else
				{
					if(j>=i-4 && j<=i)
					{
						System.out.printf("*");
					}
					else
					{
						System.out.printf("  ");
					}
				}
			}
			System.out.printf("\n");
		}
	}
}
    /* * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *
  * * * * *
    * * * * *
      * * * * *
        * * * * */