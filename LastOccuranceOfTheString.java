
import java.util.*;
public class LastOccuranceOfTheString
{
	public static void main(String x[])
	{
		 Scanner abc = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str = abc.nextLine();
		 System.out.println("enter the character to show occurance");
		 char ch = abc.next().charAt(0);
		 
		 char chr[] = str.toCharArray();
		 int no=-1;
		 int i=0;
		 for(i=0;i<chr.length;i++)
		 {
			 if(chr[i] == ch)
			 {
				 no=i;
				 // System.out.println(i);
			 }
		 }
		 if(no!=(-1))
		 {
			 System.out.println(no);
		 }
		 else
		 {
			 System.out.println("number ch nahiy");
		 }
		 
		 
	}
}
     