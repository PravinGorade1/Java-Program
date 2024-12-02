import java.util.*;
abstract class StringOperation
{
	abstract void Performoperation(char x[]);
}

class ConvertToUpper extends StringOperation
{
	public void Performoperation(char x[])
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>=97 && x[i]<=122)
			{
			  x[i]=(char)(x[i]-32);
			}
		}
		System.out.printf("\n Upper case");
		for(int i=0;i<x.length;i++)
		{
			System.out.printf(" \n%c\t",x[i]);
		}
	}
}

class MaxRepetativeChar extends StringOperation
{
	public void Performoperation(char x[])
	{
		System.out.printf("\n Max repitative");
		int count;
		int p=0;
		for(int i=0;i<x.length;i++)
		{
			count=1;
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					count++;
					if(count>p)
					{
						p=count;
                        System.out.printf("\n%c\t",x[i]);			
					}
				}
		    }
            			
		}
		
	}
}


public class StringOperationInheritance
{
	public static void main(String x[])
	{
		Scanner abc  = new Scanner(System.in);
		char a[] = new char[10];
		System.out.printf("enter the char in array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = abc.next().charAt(0);
		}
		ConvertToUpper c1 = new ConvertToUpper();
		c1.Performoperation(a);
		
		 MaxRepetativeChar m1 = new  MaxRepetativeChar();
		 m1.Performoperation(a);
		 
	}
}