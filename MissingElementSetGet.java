class Missing
{
	private int a[];
	
	public void setArray(int a[])
	{
		this.a = a;
	}
	public void getmissing()
	{
		int i=0;
		int n=1;
		while(i<a.length)
		{
			while(n!=a[i])
			{
				System.out.printf("%d",n);
				n++;
			}
			n++;
			i++;
		}
	}
}
	public class MissingElementSetGet
	{
		public static void main(String x[])
		{
			int a[] = new int[]{1,3,5,7,9};
			Missing s = new Missing();
			s.setArray(a);
			s.getmissing();
		}
	}