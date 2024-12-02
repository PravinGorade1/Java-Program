import java.util.*;
public class FiboApp
{   static int sum=0,a=0,b=1,i=1;
	public static void main(String x[])
	{   int no;
	    Scanner n = new Scanner(System.in);
		System.out.printf("enter the number");
		no=n.nextInt();
		show(no);
	}
	public static void show(int no)
	{
		if(i<=no)
		{
			System.out.printf("%d \t",sum);
			a=b;
			b=sum;
			sum=a+b;
			i++;
			show(no);
		}
	}
}