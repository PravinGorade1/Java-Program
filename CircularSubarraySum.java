public class CircularSubarraySum
{
	public static void main(String x[])
	{
		int a[] = new int[]{10,8,-20,5,-3,-5,10,-13,11};
		int last=a.length-1;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				sum+=a[i];
			}
			if(a[last]>0)
			{
				sum+=a[last];
				last--;
			}
			else
			{
				break;
			}
		}
		System.out.printf("%d",sum);
	}
}