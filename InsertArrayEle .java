import java.util.*;
class InsertEle
{
	private int ch[];
	void setarray(int c[])
	{
		ch=c;
	}
	void insertvalueinindex()
	{
		for(int i=index;i>index;i--)
		{
			ch[i+1]=ch[i];
		}
		int index=value;
	}
}

public class  InsertArrayEle 
{
	public static void main(String x[]);
	{
		int size;
	  Scanner abc = new Scanner();
	  System.out.printf("enter the insert element");
	  int value=abc.nextInt();
	  
	  System.out.printf("enter the size of the array");
	  size=abc.nextInt();
	  
	  int a[]=abc.new int[size];
	  
	  System.out.printf("enter the element of the array");
	  for(int i=0;i<a,length-1;i++)
	  {
		  a[i]=abc.nextInt();
	  }
	  
	  InsertEle e = new InsertEle();
	  e.setarray(a);
	  e.insertvalueinindex();
	}
}	