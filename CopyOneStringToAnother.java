import java.util.*;
public class CopyOneStringToAnother
{
	public static void main(String x[])
	{
	  Scanner abc = new Scanner(System.in);
	  System.out.println("enter the string");
      String str = abc.nextLine();

      char s[] = str.toCharArray();
      char p[] = new char[s.length]; 

      for(int i=0;i<s.length;i++)
	  {
        p[i] = s[i];
	  }		
   
      for(int i=0;i<p.length;i++)
	  {
         System.out.println(""+p[i]);
	  }		  
	}
}