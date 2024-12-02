import java.util.*;
public class MenuDrivenApp
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter the value in array");
		int a[] = new int[5];
		int i=0,n=0,rem=0,rev=0,ch,j=0;
		for(i=0;i<a.length;i++)
		{
			a[i] = abc.nextInt();
		}
		do
		{
		System.out.println("enter your choice: ");
		System.out.println("1: reverse all numbers");
		System.out.println("2: sort all number in asending order");
		System.out.println("3: sort all number in descending order");
		System.out.println("4: shift all even number to front and odd number to end");
		System.out.println("5: Display sum of all digits");
		System.out.println("6: Display Prime number");
		ch = abc.nextInt();
		
		switch(ch)
		{
			case 1:
			  for(i=0;i<a.length;i++)
			  {
				  n=a[i];
				  rev=0;
				 while(n!=0)
				 {
					 rem=n%10;
					 n=n/10;
					 rev=rev*10+rem;
				 }
                     a[i]=rev;				 
			  }
			  break;
			  
			  case 2:
			    
				for(i=0;i<a.length;i++)
				{
					int count=0;
					int temp=a[i];
					rev=0;
					
				while(a[i]!=0)
				{
					a[i]=a[i]/10;
					count++;
				}
				int b[]= new int[count];
				a[i]=temp;
				int k=0;
				while(a[i]!=0)
				{
					rem=a[i]%10;
					a[i]=a[i]/10;
					b[k]=rem;
					k++;
				}	
			   for(j=0;j<b.length;j++)
			    {
				  for(k=j+1;k<b.length;k++)
				   {
					  if(b[j]>b[k])
					  {
						  temp=b[j];
						  b[j]=b[k];
						  b[k]=temp;
					  }
				   }
				}
       
          for(j=0;j<b.length;j++)
	       {   
		    	rev=rev*10+b[j];  
	       }
		     a[i]=rev;
		
	  }
	    break;
		
       case 3:
	   for(i=0;i<a.length;i++)
				{
					int count=0;
					int temp=a[i];
					rev=0;
					
				while(a[i]!=0)
				{
					a[i]=a[i]/10;
					count++;
				}
				int b[]= new int[count];
				a[i]=temp;
				int k=0;
				while(a[i]!=0)
				{
					rem=a[i]%10;
					a[i]=a[i]/10;
					b[k]=rem;
					k++;
				}	
			   for(j=0;j<b.length;j++)
			    {
				  for(k=j+1;k<b.length;k++)
				   {
					  if(b[j]<b[k])
					  {
						  temp=b[j];
						  b[j]=b[k];
						  b[k]=temp;
					  }
				   }
				}
       
          for(j=0;j<b.length;j++)
	       {   
		    	rev=rev*10+b[j];  
	       }
		     a[i]=rev;
		
	  }
       break;

      case 4:
              for(i=0;i<a.length;i++)
				{
					int count=0;
					int temp=a[i];
					rev=0;
					
				while(a[i]!=0)
				{
					a[i]=a[i]/10;
					count++;
				}
				int b[]= new int[count];
				a[i]=temp;
				int k=0;
				while(a[i]!=0)
				{
					rem=a[i]%10;
					a[i]=a[i]/10;
					b[k]=rem;
					k++;
				}	
				rev=0;
				for(j=0;j<b.length;j++)
				{    
					if(b[j]%2==0)
					{
						rev=rev*10+b[j];
					}
				}
				
				for(j=0;j<b.length;j++)
				{    
					if(b[j]%2!=0)
					{
						rev=rev*10+b[j];
					}
				}
			   a[i]=rev;	
			}			  
      break;

      case 5:
	          for(i=0;i<a.length;i++)
			  {
				int count=0;
                int temp=a[i];
				rev=0;
				int sum=0;
				while(a[i]!=0)
				{
					a[i]=a[i]/10;
					count++;
			    }
			     int b[]=new int[count];
                 a[i]=temp;
                 int k=0;
				 
               	while(a[i]!=0)
				{
				   rem=a[i]%10;
                   a[i]=a[i]/10;
                   b[k]=rem;
                   k++;
				}
               
              for(j=0;j<b.length;j++)
			  {
                  sum=sum+b[j];				
			  }
             a[i]=sum;
		   }	  			 
      break;

      case 6:
      	   for(i=0;i<a.length;i++)
		   {
			   int count=0;
			   int temp=a[i];
			   rev=0;
			   
			   while(a[i]!=0)
			   {
				   a[i]=a[i]/10;
				   count++;
			   }
			   int b[]= new int[count];
			   a[i]=temp;
			   int k=0;
			   while(a[i]!=0)
			   {
				  rem=a[i]%10;
                  a[i]=a[i]/10;
                  b[k]=rem;
                  k++;
			   }
              rev=0;
               for(j=0;j<b.length;j++)
			   {
				    k=1;
				   int count1=0;
				   int num=b[j];
				while(k<=b[j])
				{
               	  if(b[j]%k==0)
				 {
                  count1++;
				 }
                   k++;
				}  
				b[j]=num;
				  if(count1==2)
				  {
					  rev=rev*10+b[j];
				  }
                 }
				 a[i]=rev;
			   }
		       				  
      break;	
	}
        for(i=0;i<a.length;i++)
     	{
		  System.out.printf(a[i]+"\t");
		} 
		Syatem.out.println("\nQuite = q or Q || continue = y or Y\n");
		key = abc.next().chartAt(0);
		}while(key!='Q' || key!='q');
	 }

   }
	