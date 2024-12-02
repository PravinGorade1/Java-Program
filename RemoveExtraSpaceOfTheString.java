 import java.util.*;
public class RemoveExtraSpaceOfTheString
{
	public static void main(String x[])
	{
		 Scanner abc = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str = abc.nextLine();
		 char ch[] = str.toCharArray();
		 
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]!=' ')
			 {
				System.out.print(ch[i]); 
			 }
		 }
	}
}