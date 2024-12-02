public class Pattern18
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			char ch=65;
			for(int j=1;j<=10;j++)
			{
			 if( j<=i || j>=11-i)
				{
					if(j<=5)
					{
					  System.out.printf("%c",ch++);
					}
					else{
					  System.out.printf("%c",ch-1);
					  ch--;
					}
				}
				else{
					
				     System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}