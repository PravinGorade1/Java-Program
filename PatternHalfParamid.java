public class PatternHalfParamid
{
	public static void main(String x[])
	{
		int i;
		int j;
		
		for(i=1;i<6;i++)
		{
			int no=1;
			for(j=1;j<10;j++)
			{
				if(j<=i+4 && j>=6-i)
				{
					System.out.printf("%d",no);
					if(j<5)
					{
						no++;
					}
					else{
						no--;
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
  /*1
   121
  12321
 1234321
123454321 */  