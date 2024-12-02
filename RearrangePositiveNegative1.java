public class RearrangePositiveNegative1
{
	public static void main(String x[])
	{
		int a[] = new int[]{-4,8,-5,-6,5,-9,7,1,-21,-11,19};
		int n = a.length;
		int pos[] = new int[n];
		int neg[] = new int[n];

         int k=0;
		 int r=0;
		for(int value:a)
		{
			if(value>=0)
			{
				pos[k++] = value;
			}
			else
			{	
		       neg[r++] = value;
			}
		}
		int flag=0;
		int l=0;
		k=0;
		r=0;
		while(l<a.length)
		{
			if(flag==1)
			{
				a[l++]=pos[k++];
				flag=0;
			}
			else{
				a[l++]=neg[r++];
				flag=1;
			}
		}
		for(int m=0;m<l;m++)
		{
			System.out.printf("%d",a[m]);
		}
	}
}