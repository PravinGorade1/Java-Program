public class StarPattern2
{
	public static void main(String x[])
	{
		int i;
		int j;
		int no=1;
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=8;j++)
			   {
					if(j<4 || j>4)
					{
						no++;
					}
					else{
						 no=2-1;
					}
					if(j>=4-i && j<=4+i)
					{
						System.out.printf("%d",no);
					}
					else{
						 System.out.printf(" ");
					}
			   }
				System.out.printf("\n");
				no=1;
		}
	}
}