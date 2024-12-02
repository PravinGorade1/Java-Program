class Swap
{
	int no;
	void setvalue(int a)
	{
		no=a;
	}
	int getnum()
	{   int orno=no;
		int first=no;
		int last=no%10;
		int count=0;
		int p=1;
		while(first>=10)
		{
            first=first/10;
			count++;
		}
		p=(int)Math.pow(10,count);
		orno=orno%p;
		
	    int swap=last*p+orno-last+first;
		return swap;
	}
}
	public class SwapFirstLast
	{
		public static void main(String x[])
		{
			Swap s = new Swap();
			s.setvalue(1234);
			int result=s.getnum();
			System.out.printf("%d",result);
		}
	}