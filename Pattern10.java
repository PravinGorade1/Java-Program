public class Pattern10
{
	public static void main(String x[])
	{
		int i;
		int j;
		int flag;
		for(i=1;i<=6;i++)
		{
			flag=1;
			for(j=1;j<=11;j++)
			{
			    if((j>=i && j<=12-i) && flag==1)
				{
					System.out.printf("*");
					flag=0;
				}
			  else if(j>=i && j<=12-i)
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
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *   */