import java.util.Arrays;

class Union
{
	int[] a,b;
	void setarray(int y[],int z[])
	{
		a=y;
		b=z;
	}
	
	void findunion()
	{   int size = a.length + b.length; 
		int Arr[]=new int [size];
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			Arr[k]=a[i];
			k++;
		}
		
		for(int j=0;j<b.length;j++)
		{
			Arr[k]=b[j];
			k++;
		}
		
		     Arrays.sort(Arr);
			  System.out.println("Union is:");
			  System.out.print(Arr[0]+" ");
			
		for(int i=1;i<size;i++)
		{
			  if(Arr[i] != Arr[i-1])
			  {
				  System.out.printf(Arr[i]+" ");
			  }
		}
		System.out.println();
	}
}
public class FindUnion
{
	public static void main(String x[])
	{
		int a[]=new int[]{1,3,2,4,5};
		int b[]=new int[]{1,2,7,5,6};
		Union u = new Union();
		u.setarray(a,b);
		u.findunion();
	}
}
