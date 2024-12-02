public class DiamondPattern
{
	public static void main(String x[])
	{
		int i;
		int j;
		for(i=0;i<9;i++)
		{
			char ch=65;
			for(j=0;j<9;j++)
			{
				if(i<=4)
				{
					if(j==4-i || j==i+4)
					{
						System.out.printf("%c",ch);
					}
					else{
						System.out.printf(" ");
					}
				}
			
			  else
			    {
			       if(j==i-4 || j==12-i)
					{
						System.out.printf("%c",ch);
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
 /* A
   A A
  A   A
 A     A
A       A
 A     A
  A   A
   A A
    A	*/