//6. create the class name as ConvertToUpper with a following methods 
import java.util.*;
class Upper
{
	char ch[];
	void setCharArray(char c[])
	{
		ch=c;
	}
	void converttouppercase()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
	}
	 void getarray()
	 {
		for(int i=0;i<ch.length;i++)
		{
			System.out.printf("%c\t",ch[i]);
		}
	 }
}
		
		public class ConvertToUpper
		{
			public static void main(String x[])
			{
				Scanner abc = new Scanner(System.in);
				char ch[]= new char[10];
				System.out.printf("enterr the character in the array");
				for(int i=0;i<ch.length;i++)
				{
					ch[i]= abc.next().charAt(0);
				}
				 Upper e = new Upper();
				e.setCharArray(ch);
				e.converttouppercase();
				e.getarray();
			}
		}
