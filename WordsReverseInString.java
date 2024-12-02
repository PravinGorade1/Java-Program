import java.util.*;
public class WordsReverseInString
{
	public static void main(String x[])
	{
	 Scanner abc = new Scanner(System.in);
     String str = abc.nextLine();
     
        for(int i=0;i<str.length();i++)
		{
			int j=i;
           while(str.charAt(j)!=' ' && j<str.length()-1)
		   {
			   j++;
		   }	
				for(int k =j-1;k>=i;k--)		   
				{
					System.out.printf("%s",str.charAt(k));
				}
			i=j;
            System.out.print(' ');	
		}		
	}
}