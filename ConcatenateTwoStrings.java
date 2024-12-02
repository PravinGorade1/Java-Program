import java.util.*;
public class ConcatenateTwoStrings
{
	public static void main(String x[])
	{
	  Scanner abc =  new Scanner(System.in);
      System.out.println("enter the first string");
      String str = abc.nextLine();
      System.out.println("enter the second string");
      String pqr = abc.nextLine();

      char c[] = str.toCharArray();
      char s[] = pqr.toCharArray();
      char k[] = new char[c.length+s.length];
	  
      int p=0;
      for(int i=0;i<c.length;i++)
	  {
        k[p++] = c[i];
	  }		
      
       for(int i=0;i<s.length;i++)
	  {
        k[p++] = s[i];
	  }		 
     
       for(int i=0;i<k.length;i++)
	  {
        System.out.print(k[i]);
	  }		 	 
	}
}