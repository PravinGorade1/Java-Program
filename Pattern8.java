public class Pattern8
{
	public static void main(String x[])
	{
		int i;
		int j;
		for(i=1;i<=5;i++)
		{
			int b=i;
			int a=i;
			for(j=1;j<=9;j++)
			{
			    if(j>=6-i && j<=5)
				{
					System.out.printf("%d",a);
					if(j<5)
					{
						a--;
					}
					else{
						a++;
					}
				}
				else if(j>5 && j<=i+4)
				{
					System.out.printf("%d",b);
					if(j>5)
					{
						b--;
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
    1
   212
  32132
 4321432
543215432  */