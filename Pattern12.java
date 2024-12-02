public class Pattern12
{
	public static void main(String x[])
	{
		int i;
		int j;
		
		for(i=1;i<=5;i++)
		{
			int no=i;
			for(j=1;j<=5;j++)
			{
				if(i==1 || j==1)
				{
					System.out.printf("%d",no);
					no++;
				}
				else if(j==6-i)
				{
				  System.out.printf("5");
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
12345
2  5
3 5
45
5
*/					
					