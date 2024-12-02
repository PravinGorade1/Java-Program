
import java.util.*;
public class RemoveFirstOccuranceOfTheString
{
	public static void main(String x[])
	{
		 Scanner abc = new Scanner(System.in);
		 System.out.println("enter the string");
		 String str = abc.nextLine();
		 char ch[] = str.toCharArray();
		 
       		 int max=0;
			 int p=0;
		  for(int i=0;i<ch.length;i++)
		  {
			  int count=1;
			  for(int j=i+1;j<ch.length;j++)
			  {
				if(ch[i] == ch[j])
				{
                  count++;
					if(count>max)
					{
					  max = count;
					}
					p=i;
				}	
			  }
		  }
				  System.out.println("\t"+ch[p]);
				  
				  int flag=0;
				  for(int i=0;i<ch.length;i++)
				  {
					  if(ch[i] == ch[p])
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
	}
}