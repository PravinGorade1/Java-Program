import java.util.*;
public class InsertElement
 {
 public static void main(String x[])
  {
	  int size;
	  Scanner xyz = new Scanner(System.in);
	  System.out.printf("enter the size of the array");
	  size = xyz.nextInt();
	  int a[] = new int[size];
	  
	  
	  System.out.printf("enter the insert value");
	  int value = xyz.nextInt();
	  
	  System.out.printf("enter the index");
	  int index = xyz.nextInt();
	  
	  System.out.printf("enter the insert element");
	  for(int i=0;i<a.length-1;i++)
	   {
		  a[i]=xyz.nextInt();
	   } 
	  for(int i=a.length-2;i>=index;i--)
	  {
		  a[i+1]=a[i];
	  }
	  a[index]=value;
	  for(int i=0;i<a.length;i++)
	   {
         System.out.printf("%d",a[i]);
	   } 
  }
 }
	 