import java.util.*;
public class DeleteTheCharOfTheString
{
	public static void main(String x[])
	{
		 Scanner abc = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str = abc.nextLine();
		 char ch[] = str.toCharArray();
		 
		 System.out.println("enter the character to delete");
		 char chr = abc.next().charAt(0);
       		 
		  int flag=0;	 
		 for(int i=0;i<ch.length;i++)
		 {
			if(ch[i]==chr)
			{
				for(int j=i;j<ch.length-1;j++)
				{
					ch[j] = ch[j+1];
				}
				flag=1;
				break;
			}			 
		 }
		 if(flag==1)
		 {
			 for(int i=0;i<ch.length-1;i++)
			 {
				System.out.print(ch[i]); 
			 } 
		 }
		 else{
                System.out.println("character not found");
			 }	
	}
}