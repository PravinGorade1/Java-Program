import java.util.*;
public class ReverseWords1
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter the data in string");
		String str = abc.nextLine();
		
		String words[] = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String word : words)
		{
			String s = "";
			for(int i=(word.length()-1);i>=0;i--)
			{
				s = s + word.charAt(i);
			}
			sb.append(s).append(" ");
		}
		System.out.println("reverse=="+sb);
	}
}