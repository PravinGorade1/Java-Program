import java.util.*;
public class BinarySearch
{
 public static void main(String x[])
   {    int size;
	   Scanner xyz = new Scanner(System.in);
	   System.out.printf("enter the size of the array");
	   size=xyz.nextInt();
	   System.out.printf("enter search value");
	   int value = xyz.nextInt();
	   int a[] = new int[size];
	   System.out.printf("enter the element of the array");
	     for(int i=0;i<a.length;i++)
	      {
		    a[i]=xyz.nextInt();
	      }
	    int left=0;
		int right=a.length-1;
		
		while(left <= right)
		{
		  int mid=left+(right-left)/2;
		  
		  if(a[mid]==value)
		   {
			System.out.printf("%d",mid);
			 break;
		   }
          if(a[mid]<value)
		   {
			  left=mid+1;
		   }
		  else{
			  right=mid-1;
		     }
		}
      System.out.printf("-1");
   }
}
	   