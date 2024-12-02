public class Kichkat2
{
	public static void main(String x[])
	{		
	int m=1;
	int c=7;
	  for(int i=1;i<=8;i++)
	   {     
         for(int j=1;j<=4;j++)	
		 {
			if(i<=4 && j<=i)
		     {
               System.out.printf("%d",m);
			   m++;
			   if(j<i)
			   {
				   System.out.printf("*");
			   }
			 }
			 else if(i>=5 && j<=9-i)
			 {
			   System.out.printf("%d",c++);
			   if(j<9-i)
			   {
				  System.out.printf("*");   
			   }
			   else if(j==9-i)
			   {
				   c=c/2-1;
			   }
			 }
			else
			{
			   System.out.printf(" ");
			}
    	 }
		 System.out.println();
		 
	   }		 
	}
}
/*
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1
*/