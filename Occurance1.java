public class Occurance1
{
	public static void main(String x[])
	{
	int a[] = new int[]{1,4,4,5,4,4,2,4,3};
     int count=1;
     int min=a[0];
    for(int i=1;i<a.length;i++)
    {
	 if(count==0)
	 {
		 min=a[i];
	 }
	 if(min==a[i])
	 {
		 count++;
	 }
	 else{
		 count--;
	 }
 }
 System.out.printf("%d",min);
 }
 }