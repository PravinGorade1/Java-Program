import java.util.*;
class  ArrayFeqCount
{
	int ch[];
	void setarray(int c[])
	{
		ch=c;
	}
	void countfrequency()
	{
		  int i=0,count=1;
		for(i=0;i<ch.length;i++)
		{
			 count=1;
			 if(ch[i]!=0)
			 {
			    for(int j=i+1;j<ch.length;j++)
			    {
				
				  if(ch[i]==ch[j])
				 {
				  ch[j]=0;
				  count++;
				 }
				
			}
			 
			  System.out.printf("[%d]---->%d\n",ch[i],count);
			 }
		}
    		
	}
}
  
  public class  ArrayFeqCountApp
  {
	  public static void main (String x[])
	  {
		  Scanner abc = new Scanner(System.in);
		  int ch[] = new int[10];
		  System.out.printf("enter the element");
		  
			  for(int i=0;i<ch.length;i++)
			  {
				 ch[i]=abc.nextInt();
			  }
			   ArrayFeqCount a = new  ArrayFeqCount();
			   a.setarray(ch);
			   a.countfrequency();
	  }
  }
			   
		  