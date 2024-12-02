import java.util.*;
public class HundredQuationPractice
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		/*System.out.printf("enter the vehicle");
		int v = abc.nextInt();
		System.out.printf("enter the wheel");
		int w = abc.nextInt();
		
		int tw = 0;
		int fw = 0;
		 if (w % 2 != 0 || v >= w || w < 2)
			 {
               System.out.println("INVALID INPUT");
			  }  
      else 
	   {
		int res = w/2;
		fw = res - v;
		tw = v - fw;
	   }
	   if(tw < 0 && fw < 0)
	   {
		   System.out.println("INVALID INPUT");
	   }
	   else{
		    System.out.println("two wheeler"+tw+"four wheeler"+fw);
	   }*/
	   
	   /*
	   ____________________________________
	   System.out.printf("enter the number of candies");
	   int n = abc.nextInt();
	   System.out.printf("enter the sold candies");
	   int s = abc.nextInt();
	   
	   int m = n;
	   int k = 5;
	   if(s <= 0 || s >= m)
	   {
        System.out.printf("invalid");
	   }	
     else{
         m -= s;
		 System.out.printf("sold candies"+s);
		 System.out.printf("avilable candies"+m);
	 }	
    if(m<=k)
	{
       m=n;
	}	*/

/*
-------------------------------------------------
    	System.out.printf("enter the weight of the cloth");
		int w = abc.nextInt();
		if(w > 0 && w <= 2000)
		{
			System.out.println("low level water");
			System.out.println("time taken"+25);
		}
		if(w > 2000 && w <= 4000)
		{
			System.out.println("medium level water");
			System.out.println("time taken"+35);
		}
		if(w > 4000 && w <= 7000)
		{
			System.out.println("high level water");
			System.out.println("time taken"+45);
		}
		*/
		
	/*____________________________________________________________________________________
	System.out.printf("enter the row");
		int r = abc.nextInt();
		System.out.printf("enter the column");
		int c = abc.nextInt();
		System.out.printf("enter the element of the array");
		int[][] k=new int[r][c];
		
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k.length;j++)
			{
				k[i][j]=abc.nextInt();
			}
		}
		int m = 0,row=0;
		for(int i=0;i<k.length;i++)
		{
			int count=0;
			for(int j=0;j<k.length;j++)
			{
				if(k[i][j]>0)
				{
				  count++;
				}
				System.out.printf("%d",k[i][j]);
			}
			if(m<count)
			{
				m=count;
				row = i;
			}
		}
		System.out.printf("==%d",row);
		____________________________________________________________________________________*/
		
		/*int n=20;
		System.out.printf("enter the etabale banana by a single monkey");
		int k = abc.nextInt();
		
		System.out.printf("enter the etable peanuts by asingle monkey");
		int j = abc.nextInt();
		
		System.out.printf("enter the number of banana");
		int tolnob = abc.nextInt();
		
		System.out.printf("enter the number of peanuts	");
		int tolnop = abc.nextInt();0
		
		int rev = tolnob/2;
		int rep = tolnop/3;
		int rem=rev+rep;
		int s = n-rem;
		System.out.printf("%d",s);
	_________________________________________________________________________________
		*/
		
	/*System.out.printf("enter the elementof the string");
	double amo=0;
	 for(int i=0;i<6;i++)
	 {
		double a=abc.nextDouble();
		amo=amo+a*18;
	 }
	
	 for(int i=0;i<3;i++)
	 {
	  double b=abc.nextDouble();
	  amo=amo+b*12;
	 }
	 System.out.printf("%f",amo);
	 ____________________________________________________________________________________*/
	 /*
	 System.out.printf("enter the element of the array");
	 int a[] = new int[]{9,8,3,4,6,9,8,7,6,5,1,2,3};
	 int sum1=0,sum2=0;
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]%2==0)
		 {
			  sum1 = sum1+ a[i];
		 }
		 else
		 {
			  sum2 = sum2 + a[i];
		 }
	 }
	 System.out.printf("%d",sum2-sum1);
	 _________________________________________________________________________________
	 */
	 
	 /*System.out.printf("enter the no");
	 double no = abc.nextInt();
	 double rem = 0;
	 double t=0;
	 double p=0;
	 while(no!=0)
	 {
		 rem = no%10;
		 no=no/10;
		 if(rem%2==0)
		 {
			t = t + rem; 
		 }
		 else{
			p = p + rem; 
		 }
	 }
	 System.out.printf("%f",p-t);
	 _________________________________________________________________________________
	 */
	 
	/* System.out.printf("enter the string\n");
	 String a = abc.nextLine();
	 char[] ch = a.toCharArray();
	 char[] k = new char[ch.length];
	 for(int i=0;i<k.length;i++)
	 {
		 k[i] =  ch[i];
	 }
	 int f=k[0];
	 int m=k.length/2;
	 int l=k.length-1;
	 for(f=0;f<m;f++)
	 {
		 char temp = k[f];
		 k[f] = k[l];
		 k[l] = temp;
		 l--;
	 }
	 int flag=0;
	 for(int i=0;i<k.length;i++)
	 {
		 if(ch[i]==k[i])
		 {
			 flag=1;
			 break;
		 }
	 }
	 if(flag==1)
	 {
		System.out.printf("palindrome"); 
	 }
	 else{
		System.out.printf("not palindrome"); 
	 }
	
	___________________________________________________________________________________*/
	
	/*System.out.printf("enter the string");
	String str = abc.nextLine();
	
	char[] ch = str.toCharArray();
	char[] k = new char[ch.length];
	for(int i=0;i<k.length;i++)
	{
		k[i] = ch[i];
	}
	
	int m=0;
	int l=0;
	for(int i=0;i<k.length;i++)
	{
   	  int count=0;
 		for(int j=i+1;j<k.length;j++)
		{
			if(k[i]==k[j])
			{
				count++;
			}	
		}
		if(count>m)
		{
			m=count;
			l=k[i];
		}
	}
	System.out.printf("%c",l);
	_________________________________________________________________________________*/
	
	/*int a[] = new int[]{38,44,63,-51,-35,19,84,-69,4,-46};
	int max= 1000;;
	int k=0;
	int m=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			int sum = a[i] + a[j];
		    if(Math.abs(sum) < Math.abs(max))
			{
			   max = sum;
				m=a[j];
				k=a[i];
			}
		}
	}
	System.out.printf("%d\n%d",m,k);
_________________________________________________________________________________	*/

 /*  int a[] = new int[]{3,4,-7,1,3,3,1,-4};
   int sum=0;
   int target=7;
   for(int i=0;i<a.length;i++)
   {
		  sum = a[i];
	   for(int j=i+1;j<a.length;j++)
	   {
		   sum+=a[j];
         if(sum==target)
		 {
            System.out.printf("[%d---%d]{",i,j);
			
		 for(int k=i;k<=j;k++)
		 {
		 System.out.printf("%d",a[k]);
		 }
			System.out.printf("}"); 
		 System.out.printf("\n");
		 }
	   }
   }_________________________________________________________________________________*/

	/*int a[] = new int[]{1,3,3,5,4,3,2,3,3};
     int count; 
     int min=0;	 
	 int k=0;
	 int mid=a.length/2;
    for(int i=0;i<a.length;i++)
	{
		count=0;
       for(int j=i+1;j<a.length;j++)
	   {
		  if(a[i]==a[j])
		  {
			  count++;
		  }
	   }
			  if(count>min)
			  {
				  min=a[i];
			  }
	}
	System.out.printf("%d",min);
   }
}   
_________________________________________________________________________________*/
 
/*int a[] = new int[]{1,4,4,5,4,4,2,4,3};
int count=1;
int min=a[0];
 for(int i=1;i<a.length;i++)
 {
	 if(count==0)
	 {
		 min=a[i];
	 }
	 if(min==a[i])
	 {
		 count++;
	 }
	 else{
		 count--;
	 }
 }
 System.out.printf("%d",min);
 }
 }_________________________________________________________________________________*/
 
 /*int a[] = new int[]{2,5,7,0,4,0,7,-5,8,0};
 int j=0;
 for(int i=0;i<a.length;i++)
 {
	 if(a[i]!=0)
	 {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		j++;
	 }
 }
  for(int i=0;i<a.length;i++)
  {
	  System.out.printf("%d",a[i]);
  }
 }
 }*/