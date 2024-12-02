
public class Pattern14
{
	public static void main(String x[])
	{
		int i;
		int j;
		
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=9;j++)
			{
					if(i<=5)
				 {
					 if(j==6-i || j==i+4 || i==5 || j==5)
					 {
					  System.out.printf("*");
					 }
					 else{
						  System.out.printf(" ");
					 }
				 }  	
				else{
					if(j==i-4 || j==14-i || i==5 || j==5)
					{
					  System.out.printf("*");
					}
	                   else{
						  System.out.printf(" ");
					 }
				}
			}
			System.out.println();
		}
	}
}
/*
    *
   ***
  * * *
 *  *  *
*********
 *  *  *
  * * *
   ***
    *
	*/
					
					