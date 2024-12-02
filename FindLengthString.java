import java.util.*;
public class FindLengthString
{
	public static void main(String x[])
	{
	   Scanner abc = new Scanner(System.in);
	   System.out.println("enter the string");
	   String str = abc.nextLine();
	   
		   int count = 0;
	   try{
		   while(true)
		   {
			   char c = str.charAt(count);
			   count++;
		   }
	   }
	   catch(Exception ex)
	   {
		   System.out.println("count is"+count);
	   }
	}
}