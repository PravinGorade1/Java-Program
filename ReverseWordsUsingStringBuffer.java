import java.util.*;
public class ReverseWordsUsingStringBuffer
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		String str = abc.nextLine();
		 
		 String words[] = str.split(" ");
		 StringBuffer sb = new StringBuffer();
		 for(String word:words)
		 {
			 String s = "";
			 for(int i = (word.length()-1);i>=0;i--)
			 {
			   s = s + word.charAt(i);
			 }
			 s = s + " ";
			 sb.append(s);
		 }
		 System.out.print(sb);
	}
}