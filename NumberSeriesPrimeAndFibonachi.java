public class NumberSeriesPrimeAndFibonachi
{
	public static void main(String x[])
	{
	    
		 int k = 1;
		 int a=0;
         int b=1;
	     int sum=1;
		 int f=14;
		 int z=0;
       for(int p=0;p<=20;p++)
		{	
			if(p%2==0)
			{
				if(f!=1)
				{
					z=sum;
					f--;
				}
				System.out.printf("%d\t",sum);
				sum = a + b;
				a=b;
				b=sum;	
					
				
				
			}		
			else
			{
				 if(f!=1)
				{
					z=k;
					f--;
				}
			   while(k<20)
				{
					
				  int count=0;
					int j=1;
					 while(j<=k)
					 {
					   if(k%j==0)
						{
						  count++;
						}
						j++;
					 }
				   if(count==2)
				   {
					 System.out.printf("%d\t",k);
					 k++;
					 break;
				   }
				 k++;
			   }
			  
			}
	   }
	   System.out.println("N th number ="+z);
	 
    }	 
 }
