public class SecondMin
{
	public static void main(String x[])
	{
		//second smalest without using sorting;
		int[] a = {2,1};
		int min = a[0];
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
			if(max<a[i])
			{
				max = a[i];
			}
		}
		int smin = max;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]>min && smin>a[i])
			{
				smin = a[i];
			}
		}
		//System.out.printf("min = %d , smin = %d",min,smin);
		if(smin == min)
		{
			System.out.printf("second mix not found");
		}
		else
		{
			System.out.printf("Second mix is: %d",smin);
		}
	}
}