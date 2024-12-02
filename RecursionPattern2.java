import java.util.*;
public class RecursionPattern2
{
	public static int i=1;
	public static int j=1;
	public static void main(String k[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter the row and col");
		int r = abc.nextInt();
		int c = abc.nextInt();
		
		show(r,c);
	}
	public static void show(int r,int c)
	{
		if(i<=r)
		{
			if(j<=c)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.printf("*");
					j++;
					show(r,c);
				}else{
					System.out.printf(" ");
					j++;
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