
import java.util.*;
abstract class Arrayoperation
{
	abstract void performoperation(int x[]);
}

class Sorting extends Arrayoperation
{
  public void performoperation(int x[])
  {
    for(int i=0;i<x.length;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			if(x[i]>x[j])
			{
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
        }	  
    }
	    for(int i=0;i<x.length;i++)
		{
			System.out.printf("%d",x[i]);
		} 
  }
}

class Insertion extends Arrayoperation
{
	int no,index;
	void setvalue(int no,int index)
	{
		this.no=no;
		this.index=index;
	}
	public void performoperation(int x[])
	{
		for(int i=x.length-2;i>=index;i--)
		{
			x[i+1]=x[i];
		}
		x[index]=no;
		
		for(int i=0;i<x.length;i++)
		{
			System.out.printf("%d\t",x[i]);
		}
	}
}

class Deletion extends Arrayoperation
{
	int index;
	void setindex(int index)
	{
	  this.index = index;	
	}
	public void performoperation(int x[])
	{
		for(int i=index;i<x.length-1;i++)
		{
			x[i]=x[i+1];
		}
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]!=0)
			System.out.printf("%d\t",x[i]);
		}
	}
}

class Rev extends Arrayoperation
{
	public void performoperation(int x[])
	{
		int mid =(x.length)/2;
		int last = x.length-1;
		System.out.println("Last="+last+"\t mid="+mid);
		for(int i=0;i<mid;i++)
		{
				int temp=x[i];
				x[i]=x[last];
				x[last]=temp;
			last--;
		}
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!=0)
			System.out.printf("%d\t",x[i]);
		}
		
		
	}
}

public class InheritanceArrayOperation
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Enter a elemen");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=abc.nextInt();
		}
		System.out.printf("\ncase 1: Sort Array");
		System.out.printf("\ncase 2: insert element in array");
		System.out.printf("\ncase 3: delete element in array");
		System.out.printf("\ncase 4: Reverse Array");
		System.out.printf("\nenter the choice");
		int ch = abc.nextInt();
		switch(ch)
		{
			case 1:
			{
			        Sorting s1 = new Sorting();
			        s1.performoperation(a);
					break;
			}
			case 2:
			{
				System.out.printf("enetr the no");
				int value = abc.nextInt();
				System.out.printf("inter the index");
				int index = abc.nextInt();
				Insertion i1 = new Insertion();
				i1.setvalue(value,index);
				i1.performoperation(a);
				break;
			}
			case 3:
			{
				System.out.printf("inter the index");
				int index = abc.nextInt();
				Deletion d1 = new Deletion();
				d1.setindex(index);
				d1.performoperation(a);
				break;
			}
			case 4:
			{
				Rev r1 = new Rev();
				r1.performoperation(a);
				break;
			}
			default:
			{
				System.out.printf("case not valid");
			}
		}
	}
}