class Prim
{
	int a[];
	void setarray(int b[])
	{
      a=b;
	}
   
    void AllPrime()
    {
		int i=0;
		while(i<a.length)
		{
			int j=1;
			while(j<i)
			{
				if(i%j==0)
				{
					System.out.printf("--%d",a[j]);
				}
				j++;
			}
			System.out.printf("--%d",a[i]);
			i++;
		}
	}
		
	}
public class Prime
{
	public static void main(String x[])
	{
      int a[]=new int[]{12,15,28,35,49};
	  Prim p = new Prim();
	  
      p.setarray(a);
      p.AllPrime();
	}
}	