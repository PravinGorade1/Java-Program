public class FloydsTrianglePattern
{
	public static void main(String x[])
	{
		int i;
		int j;
		
		for(i=1;i<=5;i++)
		{
			int no=1;
			for(j=1;j<=9;j++)
			{
			
					if(j<i)
					{
						System.out.printf("%d",no++);
						
					}
					else{
						 if(no>0)
						System.out.printf("%d",no--);	
					}
								
				}
			
			System.out.println();
		}
	}
}
/*
1
121
12321
1234321
123454321*/