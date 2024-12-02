import java.util.*;
public class SearchNumber
{
    public static void main(String x[])
   { 
    Scanner abc = new Scanner(System.in);
	int no;
	System.out.printf("enter the search key");
    int searchk = abc.nextInt();
	System.out.printf("enter the size");
	no = abc.nextInt();
	int a[] = new int[no];
	System.out.printf("enter the element");
	for(int i=0;i<a.length;i++)
	{
		a[i] = abc.nextInt();
	}
	int flag=0;
	int i=0;
	for(i=0;i<a.length;i++)
	{
		if(a[i] == searchk)
		{
			flag = 1;
            break;			
		}
	}
	if(flag == 1)
	{
		System.out.printf(i+" ");
	}
	else{
		System.out.println(-1+" ");
	}
   }
}
	