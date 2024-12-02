public class RemoveDuplicate
{
	public static void main(String x[])
	{
		int flag=0;
		int a[] = new int[]{1,2,3,4,5,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				  flag=1;
				  break;
				}
			}
		}
		if(flag==1)
		{
			System.out.printf("it is not isogram");
		}
		else{
			System.out.printf("it is isogram");
		}
	}
}