public class Pattern6
{
	public static void main(String x[])
	{
		int i;
		int j;
		
		for(i=3;i<=9;i++)
		{
			for(j=3;j<=6;j++)
			{
				if(i<7 && j<=i)
				{
					System.out.printf("%d",i);
				}
				else if(i>6 && j<=12-i)
				{
					System.out.printf("%d",12-i);
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
3
44
555
6666
555
44
3*/