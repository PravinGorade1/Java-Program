public class TestPattern
{
	public static void main(String x[])
	{
		int flag=0;
		for(int i=1;i<=11;i++)
		{
			flag=1;
			int k=i;
			int l=12-i;
			int n=2;
			for(int j=1;j<=11;j++)
			{
				if(i<=6)
				{
					if(j>=i && j<=12-i && flag==1)
					{
					 System.out.printf("%d",k++);	
					 
					 flag=0;
					}
					else{
					   System.out.printf(" ");
                       flag=1;				   
					}
				}
				else{
					if(j>=12-i && j<=i && flag==1)
					{
					  System.out.printf("%d",l);
					  l++;
					  flag=0;
					}
                     else{
                         System.out.printf(" ");
						 flag=1;
					 }						 
					
				}
			}
			System.out.println();
		}
	}
}