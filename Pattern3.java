public class pattern3
{
	public static void main(String x[])
	{
		int i;
		int j;
					
		for(i=1;i<6;i++)
		{
            int no=i;
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
 /* 1
   232
  34543
 4567654
567898765*/