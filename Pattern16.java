public class Pattern16
{
	public static void main(String x[])
	{
		int i;
		int j;
		int ch=65;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(j<=i*2-1)
				{
					System.out.printf("%c",ch);
					if(j<i)
					{
						ch--;
					}
					else{
						ch++;
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
A
BAB
CBABC
DCBABCD
EDCBABCDE