public class Pattern
{
	public static void main(String x[])
	{
		int flag;
		for(int i=1;i<=6;i++)
		{
			flag=1;
			for(int j=1;j<=11;j++)
			{
					if(j>=7-i && j<=5+i && flag==1)
			     	{  
				    	System.out.printf("*");
						flag=0;
				    }
				   else{
					   System.out.printf(" ");
					   flag=1;
				      }
				
			}
			System.out.printf("\n");
		}
	}
}