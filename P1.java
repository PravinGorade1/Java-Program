public class P1
{
	public static void main(String x[])
	{
		int flag; 
	  for(int i=1;i<=5;i++)
	   {     
         flag=1;
         for(int j=1;j<=17;j++)	
		 {
			if((j>=10-i && j<=9 && flag==1) || (j<=8+i && j>9 && flag==1))
		     {
               System.out.printf("%d",i);
			   flag=0;
			 }
			else
			{
			   System.out.printf("*");
			   flag=1;
			}
    	 }
		 System.out.println();
		 
	   }		 
	}
}
/*
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****
*/