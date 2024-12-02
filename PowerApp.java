class Power
{
	int b,i,p=1,k=1;
	void setvalue(int x,int y)
	{
		b=x;
		i=y;
	}
	void calpower()
	{
		while(k<=i)
		{
		  p=p*b;
		  k++;
		}
		System.out.printf("%d\t",p);
	}
}
	public class PowerApp
	{
		public static void main(String x[])
		{
			Power p=new Power();
			p.setvalue(5,5);
			p.calpower();
		}
	}
	
		