public class kichkat3
{
	public static void main(String x[])
	{
		int i;
		int j;
		for(i=1;i<=5;i++)
		{
			int ch=64;
			 char c=0;
			for(j=1;j<=9;j++)
			{
				if(j<=5)
				{
					if(j<=6-i)
					{
					  System.out.printf("%c",++ch);
					       if(i==1 && j>4)
						   {
							    c=(char)ch;
								c--;
						   }
						   else
						   {
				             c=(char)ch;
						   }
					  
					}
					else{
						System.out.printf(" ");
					}
				}
				else{
					  
					  
					  if(j>=i+4)
					  {
					
					    System.out.printf("%c",c--);
						
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
ABCDEDCBA
ABCD DCBA
ABC   CBA
AB     BA
A       A
*/