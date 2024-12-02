/*2)Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000*/

class Mid
{
	private int a[];
	private int b[];
	
	void setarray(int []a,int []b)
	{
		this.a=a;
		this.b=b;
	}
	float getmid()
	{ 
	  int c=a.length+b.length;
	  int m[]=new int[c];
      int k=0;
     
      for(int i=0;i<a.length;i++)
	  {
        m[k++]=a[i];
	  }	

      for(int j=0;j<b.length;j++)
	   {
         m[k++]=b[j];
	   }
	   
	   System.out.println("merge\n");
	   for(int j=0;j<m.length;j++)
	   {
        System.out.printf("%d\t",m[j]);
	   }
	   
	  float count=0;
	  float sum=0;
      for(int i=0;i<m.length;i++)
	  {
		 sum = sum + m[i];
		 count++;
	  }	
	  sum=sum/count;
	  return sum;
    }
}

 public class MidReturn
 {
	 public static void main(String x[])
	 {
		 int a[]=new int[]{7,2};
		 int b[]=new int[]{1};
		 Mid m = new Mid();
		 m.setarray(a,b);
		 float res=m.getmid();
		 System.out.printf("%f\t",res);
	 }
 }


