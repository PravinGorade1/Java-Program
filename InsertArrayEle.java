import java.util.*;
class InsertEle
{
	private int ch[];
	private int value;
	private int index;
	void setarray(int c[],int value,int index)
	{
		ch=c;
		this.value=value;
		this.index=index;
	}
	void insertvalueinindex()
	{
		for(int i=ch.length-1;i>index;i--)
		{
			ch[i]=ch[i-1];
		}
		ch[index]=value;
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.printf("%d",ch[i]);
		}
	}
}

public class  InsertArrayEle 
{
	public static void main(String x[])
	{
		int size;
	  Scanner abc = new Scanner(System.in);
	  System.out.printf("enter the insert element");
	  int value=abc.nextInt();
	  
	  System.out.printf("enter the insert index");
	  int index=abc.nextInt();
	  
	  System.out.printf("enter the size of the array");
	  size=abc.nextInt();
	  
	  int a[]=new int[size];
	  
	  System.out.printf("enter the element of the array");
	  for(int i=0;i<a.length-1;i++)
	  {
		  a[i]=abc.nextInt();
	  }
	  
	  InsertEle e = new InsertEle();
	  e.setarray(a,value,index);
	  e.insertvalueinindex();
	}
}	