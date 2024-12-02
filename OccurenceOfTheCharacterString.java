
import java.util.*;
public class OccurenceOfTheCharacterString
{
	public static void main(String x[])
	{
		 Scanner abc = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str = abc.nextLine();
		
		 char chr[] = str.toCharArray();
		 int max=0;
		 int p=0;
		 for(int i=0;i<chr.length;i++)
		 {
		   int count=1;
			   for(int j=i+1;j<chr.length;j++)
			   {
				   if(chr[i]==chr[j])
				   {
					   count++;
					   chr[j]=0;
				   }
			   }
				   if(chr[i]!=0)
				   {
					   System.out.printf("%c--->%d\n",chr[i],count);
				   }
		 }
	}
 }