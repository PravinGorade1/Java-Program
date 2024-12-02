public class NextGreater1
{
	public static void main(String x[])
	{
		int a[] = new int[]{5,3,10,9,6,13};
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					System.out.printf("%d--%d\n",a[i],a[j]);
					break;
				}
				if(a[i])
			}
		}
	}
}