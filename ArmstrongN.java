import java.util.*;
class Armstrong
{
	private int no;
	Armstrong(int no)
	{
		this.no=no;
	}
	void showallnumberbtnlimit()
	{
		int i=1;
		while(i<=no)
		{
		   int temp=i;
		   int sum=0;
		   int count=0;
		  while(i!=0)
		  {
			i=i/10;
            count++;			
		  }
		  i=temp;
		  while(i!=0)
		  {
			  int p=1;
			  int rem=i%10;
			  i=i/10;
			  p=(int)Math.pow(rem, count);
			  sum=sum+p;
		  }
		   i=temp;
		   if(sum==i)
		   {
			  System.out.printf("%d\t",i);
		   }
		  i++;
		}	
		
	}
}
  public class ArmstrongN
  {
	  public static void main(String x[])
	  {
		  int limit;
		  Scanner xyz = new Scanner(System.in);
		  System.out.printf("enter the limit");
		  limit = xyz.nextInt();
		  Armstrong a  = new Armstrong(limit);
		  a.showallnumberbtnlimit();
	  }
  }
		  
		