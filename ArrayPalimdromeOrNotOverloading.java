abstract class Palindromeapp
{
	int a[];
	void setarray(int a[])
	{
		this.a=a;
	}
	abstract void Checkpalindromarray();
}
 class palindromechecker extends Palindromeapp
 {
	 void Checkpalindromarray()
	 {
		 int c = a.length;
		 int b[] = new int[c];
		 for(int i=0;i<a.length;i++)
		 {
			 b[i]=a[i];
		 }
		 int last = b.length-1;
		 int mid = b.length/2;
         for(int i=0;i<mid;i++)
		 {
           int temp = b[i];
		   b[i] = b[last];
		   b[last] = temp;
		   last--;
		 }	
		 int flag=0;
		 for(int i=0;i<b.length;i++)
		 {
			 if(b[i]!=a[i])
			 {
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0)
		 {
			 System.out.printf("Array is palindrome");
		 }
		 else
		 {
			System.out.printf("array is not palindrome"); 
		 }
	 }
 }
 
 public class ArrayPalimdromeOrNotOverloading
 {
	 public static void main(String x[])
	 {
		int a[] = new int[]{1,2,3,2,1};
		palindromechecker p1 = new palindromechecker();
        p1.setarray(a);
        p1.Checkpalindromarray();		
	 }
 }