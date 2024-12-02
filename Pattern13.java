
public class Pattern13
{
	public static void main(String x[])
	{
		int i;
		int j;
		
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=7;j++)
			{
				if(i==1 || j==1 || j==7 || i==7)
				 {
					System.out.printf("*");
				 }
			   
               else if(j==i || j==8-i)
			    {
                    System.out.printf("*"); 
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
*******
**   **
* * * *
*  *  *
* * * *
**   **
*******	
*/				
					