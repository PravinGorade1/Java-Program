public class Pattern15
{
	public static void main(String x[])
	{
		int i;
		int j;
		for(i=1;i<=5;i++)
		{
			int ch=65;
			for(j=1;j<=9;j++)
			{
				if(j<=i*2-1)
				{
					System.out.printf("%c",ch);
					if(j<i)
					{
					 ch++;
					}
					else{
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
/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
*/