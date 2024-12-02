class Table
{
	int n,t=0,i=1;
	void settable(int x)
	{
		n=x;
	}
	void showtable()
	{
		while(i<=10)
		{
		  t=n*i;
		  System.out.printf("%d\t",t);
		  i++;
		}
	}
}
	public class TableApp
	{
		public static void main(String x[])
		{
			Table t=new Table();
			t.settable(2);
			t.showtable();
		}
	}
      		