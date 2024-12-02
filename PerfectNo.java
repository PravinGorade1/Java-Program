class Perfect
{
	int n;
	void setnum(int x)
	{
		n=x;
	}
	void calper()
	{      
			int i=1;
			while(i<=n)
			{
				int temp=i;
				int j=1;
				int sum=0;
				while(j<i)
				{
				    if(i%j==0)
				    {
				     sum=sum+j;
				    }
				  j++;
				}
				
				i=temp;
				if(i==sum)
				{
					System.out.printf("%d\t",i);   
				}
				i++;
			}
	}
}
  public class PerfectNo
  {
	  public static void main(String x[])
	  {
		  Perfect p = new Perfect();
		  p.setnum(100);
		  p.calper();
	  }
  }
  