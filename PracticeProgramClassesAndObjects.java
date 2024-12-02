/*Q1. Write a program to create class name as Cube with two methods  
void setValue(int x): this function accept number as parameter 
int getCube(): this function can calculate cube of number and return it.*/
import java.util.*;
/*class Cube
{
	int x;
	void setcube(int x)
	{
		this.x = x;
	}
	int getCube()
	{
		return x*x*x;
	}
}
 public class PracticeProgramClassesAndObjects
 {
	 public static void main(String x[])
	 {
		 Scanner abc = new Scanner(System.in);
		 Cube c1 = new Cube();
		 c1.setcube(3);
		 int result = c1.getCube();
		 System.out.printf("%d",result);
	 }
 }*/
 
 /*Q2. Write program to create class name as Factorial with two functions  
void setValue(int x): this function accept  number as parameter 
int getFactorial(): this function can calculate factorial of number and return it.*/ 

/*class Factorial
{
	int x;
	void setfactorial(int x)
	{
		this.x = x;
	}
	int getFactorial()
	{
		int fact = 1;
		int i=1;
		while(i<=x)
		{
         fact = fact * i;
         i++;		 
		}	
        return fact;		
	}
}
public class PracticeProgramClassesAndObjects
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		Factorial f1 = new Factorial();
		f1.setfactorial(6);
		int result = f1.getFactorial();
		System.out.printf("%d",result);
	}
}*/

/*Q3. Write program to create class name as CheckChar with two functions  
void setChar(char ch): this function accept single character as input  
boolean   checkChar(): this function can check character is alphabet or digit of special symbol if 
character is alphabet or digit return true if character is digit then return false.*/

/*class Checkchar
{
	char ch;
	void setchar(char ch)
	{
		this.ch = ch;
	}
	boolean getchar()
	{
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			return true;
		}
		if(ch >= '0' && ch <= '9')
		{
			return false;
		}
	}
}

public class PracticeProgramClassesAndObjects
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		char ch='a';
		Checkchar c1 = new Checkchar();
		c1.setChar(ch);
		boolean result = c1.getchar();
		if(result)
		{
		 System.out.printf("Char Is Alphabet");	
		}
		else{
			System.out.printf("Char Is Digit");	
		}
	}
}*/


/*Q3. Write program to create class name as FindMax with two functions  
void setArray(int a[]): this function is used for accept array as parameter  
int getMax(): this function can find the max value from array and return it.*/

/*class Findmax
{
	int a[];
	void setarray(int a[])
	{
		this.a = a;
	}
	int getMax()
	{
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
	  return max;
	}
}
  public class PracticeProgramClassesAndObjects
  {
	  public static void main(String x[])
	  {
		  Scanner abc = new Scanner(System.in);
		  int size;
		  System.out.printf("enter the size");
		  size = abc.nextInt();
		  int a[] = new int[size];
		  System.out.printf("enter the element of the array");
		  for(int i=0;i<a.length;i++)
		  {
			  a[i] = abc.nextInt();
		  }
		   Findmax f1 = new Findmax();
		   f1.setarray(a);
		   int result = f1.getMax();
		   System.out.printf("\nmax = %d",result);
	  }
  }*/
  
 /* Q4. Write program to create class name as SortArr with two functions  
void setArray(int a[]): this function can accept array as parameter  
int [] getSortArray(): this function can perform sorting on array and return sorted array */

/*class Sortarray
{
	int a[];
	void setarray(int a[])
	{
		this.a=a;
	}
	int[] getsortarray()
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i=-1;
			}
		}
          return a;		
	}
}
	
	public class PracticeProgramClassesAndObjects
	{
		public static void main(String x[])
		{
			Scanner abc = new Scanner(System.in);
			int size;
		  System.out.printf("enter the size");
		  size = abc.nextInt();
		  int a[] = new int[size];
		  System.out.printf("enter the element of the array");
		  for(int i=0;i<a.length;i++)
		  {
			  a[i] = abc.nextInt();
		  }
		  Sortarray s1 = new Sortarray();
		  s1.setarray(a);
		  int[] result = s1.getsortarray();
		  for(int i=0;i<a.length;i++)
		  {
		    System.out.printf("%d",a[i]);
		  }
		}
	}*/
	
	/*Q5. Write program to create POJO class name as Employee with id,name and salary attribute and 
store data in object and retrieve data from object*/

/*class Employee
{
	int id;
	String name;
	int sal;
	void setid(int id)
	{
		this.id = id;
	}
	int getid()
	{
		return id;
	}
	void setname(String name)
	{
		this.name = name;
	}
	String getname()
	{
		return name;
	}
	void setsal(int sal)
	{
		this.sal = sal;
	}
	int getsal()
	{
		return sal;
	}
}
   public class PracticeProgramClassesAndObjects
   {
	   public static void main(String x[])
	   {
		   Employee e1 = new Employee();
		   e1.setid(1);
		   int res = e1.getid();
		   System.out.printf("\n%d",res);
		   
		   e1.setname("\npravin");
		   String per = e1.getname();
		   System.out.printf("%s",per);
		   
		   e1.setsal(100);
		   int pes = e1.getsal();
		   System.out.printf("\n%d",pes);
	   }
   }*/
   
   
   /*Q6. Write program to create class name as CheckDuck with parameterized constructor  
CheckDuck(int no): this constructor can accept number as parameter 
Boolean  isDuckNumber(): this function check if number is duck return true otherwise return false.*/
  
class Checkduck
{
	int no;
	Checkduck(int no)
	{
		this.no = no;
	}
	boolean Isducknumber()
	{
		int flag = 0;
		int rem = 0;
		while(no!=0)
		{
		 rem = no % 10;
         no = no / 10;
         if(no == 0)
		 {
			flag=1;
            break;			
		 }	 
		}
        if(flag==1)
		{
          return true;
		}
		else
		{
          return false;
	    }		   
	}
}
public class PracticeProgramClassesAndObjects
{
	public static void main(String x[])
	{
		Scanner abc = new Scanner(System.in);
		int no;
		System.out.printf("enter the number");
		no = abc.nextInt();
		Checkduck c = new Checkduck(no);
		if(c.Isducknumber)
		{
			System.out.println(c.Isducknumber);
		}
		else
		{
			System.out.println(c.Isducknumber);
		}
	}
}
	
	
	
		  
  
  
		
		