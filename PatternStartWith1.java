public class PatternStartWith1
{
	public static void main(String x[])
	{
		int flag;
	  for(int i=1;i<=5;i++)
	   {     
        int a=1;
          flag=1;	
         for(int j=1;j<=9;j++)	
		 {
            if(j==6-i || i==5  && flag==1)
			{
				System.out.printf("%d",a++);
				flag=0;
			}
			else if(j==4+i && flag==1)
			{
				System.out.printf("%d",i);
				flag=0;
			}
			else
			{
				System.out.printf(" ");
				flag=1;
			}
    	 }
		 System.out.println();
		 
	   }		 
	}
}