public class CalSumDigit
{
	public static void main(String x[])
	{
    char a[] = "Hello123world456java987program".toCharArray();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='0' && a[i]<='9')
			{
			  sum=sum+a[i];
			}
		}
		System.out.printf("sum of array is %d",sum);
	}		
}

      
	  