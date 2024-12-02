public class RecursionPattern3
{
	public static int i=1;
	public static int j=1;
	public static char ch = 65;
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
				if(j>=6-i && j<=4+i)
				{
					if(j<=4){
						System.out.printf("%c",ch++);
						j++;
						show(r,c);
					}else{
						System.out.printf("%c",ch--);
						j++;
						show(r,c);
					}
				}
				else{
					System.out.printf(" ");
					j++;
					show(r,c);
				}
			}else{
				System.out.println();
				i++;
				ch=65;
				j=1;
				show(r,c);
			}
		}
	}
}