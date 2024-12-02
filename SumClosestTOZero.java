public class SumClosestTOZero
{
	public static void main(String x[])
	{
		int a[] = new int[]{38,44,63,-51,-35,19,84,-69,4,-46};
	int max= 1000;;
	int k=0;
	int m=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			int sum = a[i] + a[j];
		    if(Math.abs(sum) < Math.abs(max))
			{
			   max = sum;
				m=a[j];
				k=a[i];
			}
		}
	}
	System.out.printf("%d\n%d",m,k);
  }
}