 import java.util.*;
 public class FindMaxApp
 {
	 public static void main(String x[])
	 {    
         Scanner xyz= new Scanner(System.in);
		 int size;
		 System.out.println("Enter a size of array");
		 size=xyz.nextInt();
		 int a[]=new int[size];
		
		 System.out.println("enter the value in array");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 
		 System.out.println("Display original array");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.printf("%d\t",a[i]);
		 }
		 int m=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]>m)
			 {
				 m=a[i];
			 }
		 }
		 System.out.printf("Max value is %d\n",m);
		 int s=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			    if(a[i] > s && a[i]< m)
			    {
                   s=a[i];				
		        }
		 }
		 System.out.printf("Second max is%d\n",s);
	 }
 }	 