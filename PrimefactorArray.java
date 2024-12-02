import java.util.*;
public class PrimefactorArray
  {
  public static void main(String x[])
    {
		int size;
		Scanner xyz = new Scanner(System.in);
		System.out.printf("enter the size of the array");
		size = xyz.nextInt();
		
		int a[]=new int[size];
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
		 	a[i]=xyz.nextInt();
		}
		
		 for(int i=0;i<a.length;i++)
		 {
			int j=1;
			while(j<a[i])
			{
				if(a[i]%j==0)
				{
					int count=0;
					int b=1;
					
					while(b<=j)
					{
						if(j%b==0)
						{
						  count++;
					    }
					     b++;
					}
					if(count==2)
					{
						System.out.printf("%d\t",j);
					
					}
				}
					j++;
				}
		    	System.out.println();
				
		
		}
					
	}
 }
	