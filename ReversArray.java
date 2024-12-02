import java.util.*;
 public class ReversArray
 {
	 public static void main(String x[])
	 {
		 int size;
		 Scanner k = new Scanner(System.in);
		 System.out.printf("enter the size of the array");
		 size=k.nextInt();
		 
		 int a[]= new int[size];
		 System.out.printf("enter the element of the array");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=k.nextInt();
		 }
		 int l = a.length-1;
		 int m = a.length/2;
		 for(int i=0;i<=m;i++)
		 {
			 int temp=a[i];
			 a[i]=a[l];
			 a[l]=temp;
			 l--;
		 }
		 System.out.printf("reverse array is");
		 for(int i=0;i<a.length;i++)
		 {
		    System.out.printf("%d",a[i]);
		 }
		 
	 }
 }