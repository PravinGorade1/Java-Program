import java.util.*;
public class ShuffleString
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
    System.out.printf("enter the string 1");
	String str = abc.nextLine();
	
	System.out.printf("enter the string 2");
	String str1 = abc.nextLine();
	
	char[] ch = str.toCharArray();
	
	char[] ch1 = str1.toCharArray();
	
	int l= (ch.length+ch1.length);
	char[] m = new char[l];
	
    int index=0;
	for(int i=0;i<m.length;i++)
	{
		if(i<ch.length)
		{
			m[index++] = ch[i];
		}
		if(i<ch1.length)
		{
			m[index++] = ch1[i];
		}
	}
	Random r = new Random();
	
	for(int i=0;i<m.length;i++)
	{
	  int j = r.nextInt(12);	
	  char temp = m[i];
	  m[i] = m[j];
	  m[j] = temp;
	}
	
	System.out.printf("suffle\n");
   for(int i=0;i<m.length;i++)
	{
		System.out.printf("%c",m[i]);
	}
	}
}

