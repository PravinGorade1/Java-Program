public class Pattern5
{
	public static void main(String x[])
	{
		int i;
		int j;
		
		char no=65;
		for(i=1;i<6;i++)
		{  
	      char ch=no;
			for(j=1;j<10;j++)
			{
				if(j<=i+4 && j>=6-i)
				{
					System.out.printf("%c",ch);
					if(j<5)
					{
						ch++;
					}
					else{
						ch--;
					}
				}
				else{
					System.out.printf(" ");
				}
			}
			no++;
			System.out.println();
		}
	}
}
  /*A
   BCB
  CDEDC
 DEFGFED
EFGHIHGFE*/