import java.lang.*;
class Reverse
{
	int no;
	public
	void setvalue(int a)
	{
		no=a;
	}
	void getvalue()
	{
		int last=no%10;
		int temp=no;
		int count=0;
		int p=1;
		while(no!=0)
		{
			no=no/10;
			count++;
		}
	
		 p=(int)Math.pow(10,--count);
		int first=temp/p;
		   temp=temp%p;
		int mid=temp/10;
		int sum=last*p+mid*10+first;
		System.out.printf("%d",sum);
	}
}
public class ReverseFirstLast
{
	public static void main(String x[])
	{
		Reverse k = new Reverse();
		k.setvalue(1234);
		k.getvalue();
	}
}