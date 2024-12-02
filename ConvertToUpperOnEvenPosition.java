import java.util.*;
class Upper
{
	private char ch[];
	Upper(char []ch)
	{
		this.ch=ch;
	}
	char[] getupper()
	{
	   for(int i=0;i<ch.length;i++)
		 {
			 if(i%2!=0)
			 {
				 if(ch[i]>=97 && ch[i]<=122)
				 {
				    ch[i]=(char)(ch[i]-32);
				 }
			 }
		 }
          return ch;		 
	}
}
  public class ConvertToUpperOnEvenPosition
  {
	  public static void main(String x[])
	  {
		  Scanner xyz = new Scanner(System.in);
		  char ch[]=new char[5];
		  for(int i=0;i<ch.length;i++)
		  {
			  ch[i]=xyz.next().charAt(0);
		  }
		  Upper u = new Upper(ch);
		  char[] res=u.getupper();
		  for(int i=0;i<ch.length;i++)
		  {
			  System.out.printf("%c",ch[i]);
		  }
	  }
  }
		  