 /*WAP to print the following pattern?
     a
	 AB
	 abc
	 ABCD
	 abcde */
	 
	 public class ParamidPattern
	 {
	   public static void main(String x[])
	   {
		   for(int i=0;i<5;i++)
		   {
			   char ch='A';
			   char ch1='a';
			   for(int j=0;j<5;j++)
			   {
				   if((j<=i) && (i%2!=0))
				   {
					   System.out.printf("%c",ch);
					   ch++;
				   }
				  else if((j<=i) && (i%2==0))
				        {
					     System.out.printf("%c",ch1);
                         ch1++;
				         }
				   else{
					   System.out.printf(" ");
				   }
					   
			   }
			   System.out.printf("\n");
		   }
	   }
	 }