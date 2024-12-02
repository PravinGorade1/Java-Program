import java.util.*;
public class ToggleCaseOfString
{
	public static void main(String x[])
	{
	  Scanner abc = new Scanner(System.in);
      System.out.println("enter the string");
      String str = abc.nextLine();
	  
	  char chars[] = str.toCharArray();
	  
	  for(int i=0;i<chars.length;i++)
	  {
		  if(Character.isUpperCase(chars[i]))
		  {
			 chars[i] = Character.toLowerCase(chars[i]); 
		  }
		  else if(Character.isLowerCase(chars[i]))
		  {
			 chars[i] = Character.toUpperCase(chars[i]); 
		  }
	  }
	  String pqr = new String(chars);
	  System.out.print(pqr);
	}
}