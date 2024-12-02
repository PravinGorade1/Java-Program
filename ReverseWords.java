import java.util.*;
class Reverse
{
	String s;
	void setstring(String s)
	{
		this.s = s;
	}
	void showstring()
	{
		for(int i=0;i<s.length();i++)
		{
			int j=i;
			while(j<s.length() && s.charAt(j)!=' ')
			{
				j++;
			}
			  for(int k=j-1;k>=i;k--)
			  {
				System.out.printf("%c",s.charAt(k));
			  }
			  i=j;
			  System.out.printf("\t");
		}
	}
}

 public class ReverseWords
 {
	 public static void main(String x[])
	 {
		 Scanner abc = new Scanner(System.in);
		 System.out.printf("enter the string\n");
		 String s = abc.nextLine();
		 Reverse s1 = new Reverse();
		 s1.setstring(s);
		 s1.showstring();
	 }
 }