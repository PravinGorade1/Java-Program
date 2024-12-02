public class Kichkat
{
	public static void main(String x[])
	{
	  for(int i=1;i<=7;i++)
	   {     
		int k=1;
         for(int j=1;j<=7;j++)	
		 {
			if((j==5-i && j<=4 && i<=4) ||(j==i+3 && j>3 && i<=4) || (j==i-3 && j<=4 && i>=4) || (j==11-i && i>=4 && j>=4))
		     {
               System.out.printf("*");
    	     }
			 
			else if((j>=5-i && j<=4 && i<=4) || (j<=i+3 && j>3 && i<=4) || (j>=i-3 && j<=4 && i>=4) || (j<=11-i && i>=4 && j>=4))
		     {
               if(j<=3)
			   {
				    System.out.printf("%d",k++); 
			   }
			   else{
				     System.out.printf("%d",k--);
			   }
			 }
    	    		 
		 }
		    System.out.println();
		 
	   }
	   
	}
}
/*
*
*1*
*121*
*12321*
*121*
*1*
*

*/