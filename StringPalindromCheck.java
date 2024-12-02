import java.util.*;
 abstract class Palindrom
 {
	 String str;
     void setstring(String str)
	{
		this.str = str;
	}
	abstract void Ispalindrome();
 }
 
 class CheckPalindrome extends Palindrom   // nitin  nitin 
 {
	 void Ispalindrome()
	 {
       char s[]=str.toCharArray();
	   char b[]=new char[s.length];
	   for(int i=0;i<s.length;i++)
	   {
		   b[i]=s[i];
	   }
	   int first=b[0];
       int last=b.length-1;
       int mid = b.length/2;
	   
	   for(int i=0;i<mid;i++)
	   {
		   char temp= b[i];
		   b[i]=b[last];
		   b[last]=temp;
		   last--;
	   }
	   int flag=0;
	   for(int i=0;i<s.length;i++)
	   {
		   if(s[i]!=b[i])
		   {
			   flag=1;
			   break;
		   }
	   }
	   if(flag==0)
	   {
		 System.out.printf("string is palindrome");  
	   }
	   else{
		 System.out.printf("not palindrome");  
	   }
	 }
		 
 }
 
 public class StringPalindromCheck
 {
	 public static void main(String x[])
	 {
		 Scanner abc =  new Scanner(System.in);
		 System.out.printf("enter the string\n");
		 String str = abc.nextLine();
		 CheckPalindrome c1 = new CheckPalindrome();
		 c1.setstring(str);
		 c1.Ispalindrome();
	 }
 }