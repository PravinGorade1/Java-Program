import java.util.Arrays;
class FindUnion
{
	private int a[];
	private int b[];
	
	public void setarray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	public int[] getarray()
	{   
	    int length=a.length+b.length;
		int c[] = new int[length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[k]=b[j];
			k++;
		}
		
		System.out.printf("sort is\n");
		 Arrays.sort(c);
		 
		int temp[]=new int[length];
		int j=0;
		temp[j++]=c[0];
		for(int i=1;i<length;i++)
		{
			if(c[i] != c[i-1])
			{
				temp[j++]=c[i];
			}
		}
		
		 int[] union = new int[j];
        for (int i = 0; i < j; i++) 
		{
            union[i] = temp[i];
        }
		return union;
		
	}
}
	
	public class FindunionAppSetGet
	{
		public static void main(String x[])
		{
			int a[]=new int[]{1,3,5,4,2};
			int b[]=new int[]{1,3,5,4,2};
			FindUnion  s = new FindUnion();
			s.setarray(a,b);
			int[] result = s.getarray();
			for(int value : result)
			{
			  System.out.printf(value+" ");
			}
		}
	}