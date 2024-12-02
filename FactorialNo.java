class Factorial
{
	int n;
	void setvalue(int x)
	{
		n=x;
	}
	void showvalue()
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.printf("%d",f);
	}
}
  public class FactorialNo
  {
	  public static void main(String x[])
	  {
		  Factorial f = new Factorial();
		  f.setvalue(5);
		  f.showvalue();
	  }
  }
  