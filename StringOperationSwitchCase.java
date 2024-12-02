import java.util.*;

class A{
	   String name;
	   
	  A setData(String name)
	  {
		this.name=name; 
		System.out.println(this);
           return this;		
	  }
	  
	  void display()
	  {
		  System.out.println("show method "+name);
	  }
	  public String toString()
	  {
		return this.name;
	  }
}

public class StringOperationSwitchCase
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
			char ch;
		do{
			System.out.printf("case 1: Reversing a String\n");
			System.out.printf("case 2: inserting charcter\n");
			System.out.printf("case 3: Appding a string\n");
			System.out.printf("case 4: Deleting charcter in the string\n");
			System.out.printf("case 5: Repalce a Substring\n");
			System.out.printf("case 6: Check capacity insure capacity from substring class\n");
			System.out.printf("case 7: Demonstrate  channing method\n");
			System.out.printf("enter the choice\n");
			int choice = abc.nextInt();
			switch(choice)
			{
				case 1:
				{
					Scanner xyz = new Scanner(System.in);
					System.out.printf("enter the string");
					String str = xyz.nextLine();
					
					StringBuffer sb = new StringBuffer(str);
					sb.reverse();
					
					System.out.println(sb);
					break;
				}
				
				case 2:
				{
					Scanner aba = new Scanner(System.in);
					System.out.printf("enter the string\n");
					String str = aba.nextLine();
					
					StringBuffer sb = new StringBuffer(str);
					sb.insert(3,"very");
					
					System.out.println(sb);
					break;
				}
				case 3:
				{
					Scanner a = new Scanner(System.in);
					System.out.printf("enter the string\n");
					String str = a.nextLine();
					
					System.out.printf("ente the second string\n");
					String str1 = a.nextLine();
					
					StringBuffer sb = new StringBuffer(str);
					sb.append( str1);
					System.out.println(sb);
					break;
				}
				case 4:
				{
					Scanner k = new Scanner(System.in);
					System.out.printf("enter the string");
					String str = k.nextLine();
					
					StringBuffer sb = new StringBuffer(str);
					sb.delete(2,4);
					System.out.println(sb);
					break;
				}
				case 5:
				{
					Scanner c = new Scanner(System.in);
					System.out.printf("enter the string\n");
					String str = c.nextLine();
					
					System.out.printf("enter the substring\n");
					String str1 = c.nextLine();
					
					StringBuffer sb = new StringBuffer(str);
					sb.replace(4,6,str1);
					
					System.out.println("Updated string: " + sb);
					break;
				}
				case 6:
				{
					StringBuffer sb = new StringBuffer();
					System.out.println("Capacity"+sb.capacity()); //16
					sb.ensureCapacity(20);
					System.out.println("Capacity"+sb.capacity()); //20
					
					Scanner sc=new Scanner(System.in);
					sb.append("abcd");
					System.out.println(sb); 
					
					System.out.println("Ensure Capacity"+sb.capacity()); //
					break;
				}
				
				case 7:
				{
					Scanner v = new Scanner(System.in);
					System.out.printf("enter the string");
					String str = v.nextLine();
					
					  
					new A().setData(str).display();
					 System.out.println("hello");
					//StringBuffer sb = new StringBuffer(str);
					//a.display();
					break;
				}
				default :
				{
					System.out.println("Invalid choice! Please try again.");
                    break;
				}
			}
			ch = abc.next().charAt(0);
			System.out.printf("do you continue");
		}while(ch == 'y' || ch == 'Y');
	}
}