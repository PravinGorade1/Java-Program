import java.util.*;
public class SmallestMissingElement
	
{
	public static void main(String x[])
	{
	 Scanner abc = new Scanner(System.in);
     int a[] = new int[]{1,3,5,7,9};
     int i=0;
	 int j=1;
       /*while(i<a.length)
	   {
		 
	     while(j!=a[i])
	      {
		        System.out.printf("%d\n",j); 
				j++;	
		  }				
	       j++;
	       i++;
	    } */
		
		while(i<a.length)
	   {
			  if(a[i]!=j)
			  {
		        System.out.printf("%d\n",j); 
				break;
			  }
			  else{
				  
                 j++;				 
			  }
	       i++;
	    } 
	}
	
}