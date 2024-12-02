import java.util.*;
 public class AlternativelyMerge
 {
	 public static void main(String x[])
	 {
		 Scanner abc = new Scanner(System.in);
		System.out.printf("enter the first string");
		String f = abc.nextLine();
		System.out.printf("enter the second string");
		String s = abc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		int max=0,i=0,limit=0;
		String str="";
		if(f.length()>s.length())
		{
			limit = s.length();
            max = f.length();
            str	= f;		
		}else{
			limit = f.length();
			max = s.length();
			str = s;
		}
		
		for(i=0;i<limit;i++)
		{
			char first = f.charAt(i);
			sb.append(first);
			char second = s.charAt(i);
			sb.append(second);
		}
		
		for(int k=i;k<max;k++)
		{
			char m = str.charAt(k);
			sb.append(m);
		}
		System.out.println(sb);
	 }
 }