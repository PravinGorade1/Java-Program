
import java.util.*;
public class AllOccuranceOftheCharacter
{
	public static void main(String x[])
	{
		 Scanner abc = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str = abc.nextLine();
		 System.out.println("enter the character to show occurance");
		 char ch = abc.next().charAt(0);
		 
		 char chr[] = str.toCharArray();
		 int count = 0;
		 for(int i=0;i<chr.length;i++)
		 {
			 if(chr[i]==ch)
			 {
				count++; 
			 }
		 }
		 System.out.println("character\t"+ch+"\t"+count+"\ttimes apper in the string");
	}
}