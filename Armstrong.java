import java.util.*;
public class Armstrong
{
	public static void main(String x[])
	{    int no;
	     int count=0,sum=0;
		Scanner xyz = new Scanner(System.in);
		System.out.printf("entee the number");
		no=xyz.nextInt();
		int number = no;
		int temp=no;
		int p;
		int rem;		
		while(temp!=0)
		{
		    temp=temp/10;
			count++;
		}
			temp=no;
				while(temp!=0)
				{
					rem=temp%10;
					temp=temp/10;
		            p=(int)Math.pow(rem, count);
					sum=sum+p;
				}
		if(sum==number)
		{
			System.out.printf("Armstrong");
		}
		else{
			System.out.printf("not Armstrong");
		}
	}
}
		