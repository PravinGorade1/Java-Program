public class RecursionPattern4
{
	public static int i=1;
	public static int j=1;
	public static int flag=0;
	public static void main(String k[])
	{
	  show(5,9);	
	}
	public static void show(int r,int c)
	{
		if(i<=r)
		{
			if(j<=c)
			{
				if(j>=6-i && j<=4+i && flag==1)
				{
					System.out.printf("*");
					j++;
					flag=0;
					show(r,c);
				}
				else{
					System.out.printf(" ");
					j++;
					flag=1;
					show(r,c);
				}
			}else{
				System.out.println();
				i++;
				j=1;
				show(r,c);
			}
		}
	}
}