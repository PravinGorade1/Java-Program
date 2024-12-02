import java.util.*;
public class PalindromeNo
{
	public static void main(String x[])
	{
	     Scanner abc = new Scanner(System.in);
     	 int no;
		 System.out.printf("enter the number");
		 no = abc.nextInt();
		 int rem=0;
		 int rev = 0;
		 int temp=no;
		 while(no!=0)
		 {
			rem = no % 10;
            no = no / 10;
            rev	= rev * 10 + rem;		
		 }
		   no=temp;
		 if(no==rev)
		 {
			 System.out.printf("palindrome");
		 }
		 else{
			  System.out.printf(" not palindrome");
		 }
	}
}

