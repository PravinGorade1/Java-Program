import java.util.*;
public class PrimeFactor
{
	public static void main(String x[])
	{
		int no;
		Scanner ky = new Scanner(System.in);
		System.out.printf("enter the size of the array");
		no = ky.nextInt();
		/*int a[] = new int[size];
		
		System.out.printf("enter the element of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=k.nextInt();
		}
		*/
		
			int j=1;
			while(j<no)
			{
				if(no%j==0)
				{
			        int count=0;
					int a=1;
				    while(a<=j)
					{
                      if(j%a==0)
					  {
                        count++;
					  }
                       a++;
					}
                  	if(count==2)
					{
                       System.out.printf("%d\t",j);
					}
					
			    }				 
                   j++;
			}	
		}
	}			
			