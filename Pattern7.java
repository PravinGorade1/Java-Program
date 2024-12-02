public class Pattern7
{
	public static void main(String x[])
	{
		int i;
		int j;
		for(i=0;i<=5;i++)
		{
			int no=0;
			for(j=0;j<=12;j++)
			{
				if(j<7)
				{
					if(j<=i)
					{
						System.out.printf("%d",no++);
					}	
					else{
						System.out.printf(" ");
					}
				}
				else{
					if(j>=12-i)
					{
						System.out.printf("%d",no-1);
						no--;
					}
					else{
						System.out.printf(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
/*
0           0
01         10
012       210
0123     3210
01234   43210
012345 543210*/