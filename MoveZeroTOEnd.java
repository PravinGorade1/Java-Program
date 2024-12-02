public class MoveZeroToEnd
{
	public static void main(String x[])
	{
		int a[] = new int[]{2,5,7,0,4,0,7,-5,8,0};
 int j=0;
 for(int i=0;i<a.length;i++)
 {
	 if(a[i]!=0)
	 {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		j++;
	 }
 }
  for(int i=0;i<a.length;i++)
  {
	  System.out.printf("%d",a[i]);
  }
 }
 }