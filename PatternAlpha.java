public class PatrnAlpha
{
	public static void main(String x[])
	{
	  for(int i=1;i<=5;i++)
	   { 
		char ch = 65;
          
         for(int j=1;j<=9;j++)	
		 {
            if((j<=6-i && j<=5) || (j>=4+i && j>5))
			{
				if(j<=5)
				{
					System.out.printf("%c",ch+j-1);
				}
				else{
					System.out.printf("%c",ch+9-j);
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