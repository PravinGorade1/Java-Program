public class PatternCode
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			 char ch = 65;
			for(int j=1;j<=9;j++)
			{
				if(j<=2*i-1)
				{
					if(j<i)
					{
						System.out.printf("%c",ch++);
					}
					else{
						System.out.printf("%c",ch--);
					}
				}
				else
				{
				   System.out.printf(" ");
				}
			}
				System.out.printf("\n");
		}
	}
}