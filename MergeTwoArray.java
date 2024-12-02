class Merge
{
	int[] a,b;
	void acceptarray(int[] y,int[] z)
	{
		a=y;
		b=z;
	}
	void showarray()
	{
		int size = a.length + b.length; 
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
		
		for(int i=0;i<Arr.length;i++)
		{
			System.out.printf("%d\n",Arr[i]);
		}
	}
}
public class MergeTwoArray
{
	public static void main(String x[])
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[]{10,20,30,40,50};
		Merge m = new Merge();
		m.acceptarray(a,b);
		m.showarray();
	}
}