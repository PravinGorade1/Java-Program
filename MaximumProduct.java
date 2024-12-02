/*9)	Write a Java program to find the maximum product of two integers in a given array of integers.  
Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56  */

class Product
{
	private int a[];
	void setarray(int []a)
	{
		this.a=a;
	}
	void getproduct()
	{
		int product=0;
		int p=0;
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]*a[j]>product)
				{
					product=a[i]*a[j];
					k=i;
					p=j;
					
				}
			}
		}
			System.out.printf("%d\t%d",a[k],a[p]);
			System.out.println();
			System.out.printf("%d",product);
	}
}
  public class MaximumProduct
  {
	  public static void main(String x[])
	  {
		  int a[] = new int[]{2, 3, 5, 7, -7, 5, 8, -5};
		  Product p = new Product();
		  p.setarray(a);
		  p.getproduct();
	  }
  }
