import java.util.*;
public class PrimeNo
{
	public static void main(String x[])
	{
		Scanner yz = new Scanner(System.in);
		int n;
		System.out.printf("enter the number");
		n=yz.nextInt();
		
		int i=1;
	   while(i<=n)
		{
			int count=0;
		    int j=1;
		while(j<=i)
		{
           if(i%j==0)
		   {
             count++;
		   }
          j++;
		 }
		
        if(count==2)
	    {
		    System.out.printf("%d\t",i);
	    }
         i++;	
	  }	  
	}
}