import java.util.*;
public class TotalNumberOfWordsInString
{
	public static void main(String x[])
	{
	  Scanner abc = new Scanner(System.in);
      System.out.println("enter the string");
      String str = abc.nextLine();
      
	  int count=0;
      for(int i=0;i<str.length();i++)
	  {
         if(str.charAt(i)==' ')
		 {
			count++; 
		 }
	  }	
      	System.out.print(count+1);  
	}
}