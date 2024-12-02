public class StarApp
{
	public static void main(String x[])
	{
		int i;
		int j;
		for(i=0;i<=12;i++)
		{
			for(j=0;j<=12;j++)
			{
				if(i<=6)
				{
					if(j>=6-i && j<=6+i)
					{
						System.out.printf("*");
					}
					else{
						 System.out.printf(" ");
					}
				}
					else{
						if(j>=i-6 && j<=18-i)
						{
							System.out.printf("*");
						}
						else{
							System.out.printf(" ");
						}
					}
				}
            System.out.printf("\n");
		}
	}
}