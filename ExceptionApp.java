import java.util.*;
public class ExceptionApp
{
	static int a[];
	public static void main(String x[])
	{
		char ch;
		  do{
				Scanner abc =  new Scanner(System.in);
				System.out.println("case 1: ArrayIndexOutOfBoundsExceptio");
				System.out.println("case 2: ArithmeticException");
				System.out.println("case 3: StringOutOfBoundsException");
				System.out.println("case 4: NullPointerEx+ception");
				System.out.println("case 5: NumberFormatException");
				System.out.println("case 6: InputMismatchException");
				System.out.println("case 7: ClassNotFoundException");
				System.out.println("Enter your choice");
				int choice = abc.nextInt();
				switch(choice)
				{
					case 1: 
					{
						 //ArrayIndexOutOfBoundsExceptio
						 a = new int[2];
						 try
						 {
							a[0] = 10;
							a[1] = 20;
							a[2] = 30;
							System.out.printf("%d\t",a[2]);
						 }
						 catch(ArrayIndexOutOfBoundsException arr)
						 {
							System.out.println("index is greater than size");
							System.out.println("error is"+arr);
						 }
						 break;
					}
					case 2:
					{
							//ArithmeticException
							System.out.println("enter the two number");
							int a = abc.nextInt();
							int b = abc.nextInt();
					  try{
							int c = a / b;
							System.out.printf("%d\t",c);
					    }
						catch(ArithmeticException ar)
						{
							System.out.println("Second number is not zero");
							System.out.printf("error is"+ar);
						}
						break;
					}
					case 3:
					{
						//StringOutOfBoundsException
						System.out.println("enter the string");
						String a = abc.nextLine();
						try
						{
							System.out.println(a.charAt(6));
						}
						catch(StringIndexOutOfBoundsException st)
						{
							System.out.println("index not present in the string");
							System.out.printf("error is"+st);
						}
						break;
					}
					
					case 4:
					{
						try{
							a[0] = 10;
							System.out.printf("%d\t",as);
						}
						catch(NullPointerException pt)
						{
							System.out.println("--index not present in the string");
							System.out.printf("error is"+pt);
						}
					}
					
					case 5:
					{
						try{
							String s = "1234";
							int a = Integer.parseInt(s);
						}
						catch(NumberFormatException nu)
						{
							System.out.println("error is"+nu);
						}
						break;
					}
					
					case 6:
					{
						System.out.println("enter the two value");
						int k = abc.nextInt();
						int l = abc.nextInt();
						try{
							int m = l+k;
							System.out.println(m);
						}
						catch(InputMismatchException in)
						{
							System.out.println("error is"+in);
						}
						break;
					}
					/*case 7:
					{
						try{
							//Class.for("ExceptionApp");
						}
						catch(ClassNotFoundException cl)
						{
							System.out.println("error is"+cl);
						}
					}*/
					
						 default:
						{
							System.out.printf("wrong choice");
						}
				}
					 System.out.println("do you continue again");
					 ch=abc.next().charAt(0);
					 
				}while(ch=='y' || ch=='Y');
		  }
	}
