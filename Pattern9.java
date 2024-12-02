public class Pattern9
{
	public static void main(String x[])
	{
		int i;
		int j;
		int flag=0;
		for(i=1;i<=6;i++)
		{
			flag=1;
			for(j=1;j<=11;j++)
			{
			    if((j>=7-i && j<=i+5) && flag==1)
				{
					System.out.printf("*");
					flag=0;
				}
			  else if(j>=7-i && j<=i+5)
				{
					System.out.printf(" ");
					flag=1;
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
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *	*/
					