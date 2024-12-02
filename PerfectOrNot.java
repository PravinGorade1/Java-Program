import java.util.*;
public class PerfectOrNot
{
	public static void main(String x[])
	{
	  Scanner abc = new Scanner(System.in);
      int no;
	  System.out.printf("enter the number");
      no = abc.nextInt();
	  
	  int temp = no;
	  int i = 1;
	  int sum = 0;
	  while(i<no)
	  {
        if(no%i==0)
		{
			sum += i;
		}
		i++;
	  }
     no = temp;	  
     if(no == sum)
	 {
       System.out.printf("Perfect");
	 }
     else{
       System.out.printf("Not Perfect");
	 }		 
	}
}