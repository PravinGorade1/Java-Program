import java.util.*;
/*Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and 
we have to create three child classes name as Add with function int getAdd() , Mul with function 
getMul() and Div with function getDiv()  and getAdd() function return addition of two value which  is 
inherited from Value class , getMul() function return multiplication of two values which is  inherited 
from Value class and gitDiv() function return division of two values which Is inherited from Value 
*/
/*
class Value
{
	int a;
	int b;
	void setvalue(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
 int getadd()
 {
	 return a+b;
 }
 int getmul()
 {
	 return a*b;
 }
 int getdiv()
 {
	 return a/b;
 }
}
 
 public class ProgramPracticeOninheritance
 {
	 public static void main(String x[])
	 {
		 Value v1 = new Value();
		 v1.setvalue(40,20);
		 int result = v1.getadd();
		 System.out.printf("%d\n",result);
		 
		 result = v1.getmul();
		 System.out.printf("%d\n",result);
		 
		 result = v1.getdiv();
		 System.out.printf("%d",result);
	 }
 }*/
 
 /* Q2. Write program to create class name Area with methods name as void setRadius(float radius) and 
void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have 
to define float getCircleArea() method in Circle child class and calculate area of circle and return it 
 and You have to define getRectArea() method in Rectangle class and calculate area of rectangle and 
return it  */

/*
class Area 
{
	int radius;
	int len;
	int wid;
	void setradius(int radius)
	{
		this.radius = radius;
	}
	void setLengthWidth(int len,int wid)
	{
		this.len = len;
		this.wid = wid;
	}
	int getCircleArea()
	{
		double p = 3.14*radius*radius;
		return (int)p;
	}
	int getrectarea()
	{
		int a = len*wid;
		return a;
	}
}
public class ProgramPracticeOninheritance
{
	public static void main(String x[])
	{
		Area a1 = new Area();
		a1.setradius(10);
		int result = a1.getCircleArea();
		System.out.printf("%d\n",result);
		
		a1.setLengthWidth(10,20);
		 result = a1.getrectarea();
		System.out.printf("%d",result);
	}
}*/

/*Q3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have to 
create child class name as GetSum with method  int getArrSum() you have to accept array values 
from ArrSum and calculate its sum and return it */

/*class Arrsum
{
	int a[];
	void setarray(int a[])
	{
	 this.a = a;	 
	}
	int getsum()
	{
		int sum = 0;
	  for(int i=0;i<a.length;i++)
	  {
        sum = sum + a[i];      
	  }	 
        return	sum;  
	}
}
public class ProgramPracticeOninheritance
{
	public static void main(String x[])
	{
		int a[] = new int[]{1,2,3,4,5};
		Arrsum a1 = new Arrsum();
		a1.setarray(a);
		int result = a1.getsum();
		
		   System.out.printf("%d",result);
	}
}*/

/*Q4. Write program to Create class name as PersonalInfo with parameterized constructor  
PersonalInfo(String name, String middlename, String lastname) and you have to create class name as 
ProfessionalInfo with parameterized constructor  like as ProfessionalInfo(int id,String des,int 
salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass 
parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to 
define void show() method in ProfessionalInfo and you have to show the all data in show() method.*/

/*
class PersonalInfo
{
	private String name;
	private String middlename;
	private String lastname;
	
	public PersonalInfo(String name,String midname,String lastname)
	{
		this.name = name;
		this.middlename = middlename;
		this.lastname = lastname;
	}
	String getname()
	{
	  return name;	
	}
	String getmiddlename()
	{
		return middlename;
	}
	String getlastname()
	{
		return lastname;
	}
}

class ProfetionalInfo extends PersonalInfo
{
	private int id;
	private int salary;
	private String skillset;
	private String des;
	
	public ProfetionalInfo(String name,String middlename,String lastname,int id,String des,int salary,String skillset)
	{
		super(name,middlename,lastname);
		this.id = id;
		this.des = des;
		this.salary = salary;
		this.skillset = skillset;
	}
  public void show()
  {
	  System.out.println("personal Info");
	  System.out.println("Name"+getname());
	  System.out.println("Middle name"+getmiddlename());
      System.out.println("Latsname"+getlastname());
      System.out.println("Profetional Info");
	  System.out.println("id"+id);
	  System.out.println("des"+des);
      System.out.println("salary"+salary);
	  System.out.println("skillset"+skillset);
  }
}
public class ProgramPracticeOninheritance
{
	public static void main(String x[])
	{
		ProfetionalInfo p1 = new ProfetionalInfo("pravin","madhavrao","gorade",1,"des",60000,"java");
		p1.show();
	}
}*/

/*Q5. Write  Program to perform method overriding you have to create class name as ArrParent with 
method  
void setValue(int arr[]): this method can accept array as parameter  
void arrangeSeq(): this method can display array as per user input sequence 
You have to create two child class name as ArrangeAscendingOrder and you have to inherit 
ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and 
display in ascending order and you have to create one more class name ReverseArray and override 
arrangeSeq() method from ArrParent and reverse array and display it.*/

/*class Arrayparrent
{
	int a[];
	void setarray(int a[])
	{
	 this.a = a;	
	}
	void arrangeseq()
	{
		
	}
}
 class ArrangeAscendingOrder extends Arrayparrent
 {
	void arrangeseq()
	{
     for(int i=0;i<a.length-1;i++)
	 {
		 if(a[i]>a[i+1])
		 {
			 int temp = a[i];
			 a[i] = a[i+1];
			 a[i + 1] = temp;
			 i=-1;
		 }
	 }
	 		 System.out.printf("Assending order");

	 for(int i=0;i<a.length;i++)
	 {
		 System.out.printf("%d\n",a[i]);
	 }
	}
 }	
 class Reversearray  extends Arrayparrent
 {
	 void arrangeseq()
	 {
		 int f = 0;
		 int l = a.length-1;
		 int m = a.length/2;
		 for(f = 0;f<m;f++)
		 {
			 int temp = a[f];
			 a[f] = a[l];
			 a[l] = temp;
			 l--;
		 }
		 System.out.printf("Reverse array");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.printf("%d",a[i]);
		 }
	 }
 }
 
 public class ProgramPracticeOninheritance
 {
	 public static void main(String x[])
	 {
		int a[] = new int[]{1,3,2,4,5,};
		ArrangeAscendingOrder a1 = new ArrangeAscendingOrder();
		a1.setarray(a);
		a1.arrangeseq();
		
		Reversearray r1 = new Reversearray();
		r1.setarray(a);
		r1.arrangeseq();
	 }
 }*/
 
 /*Q6. Write Program to create abstract class name as Value with one abstract and one non abstract 
method  
void setValue(int ,int): this is non abstract method with two parameter  
abstract int getResult(): this is abstract method  
and you have two child class name as Power and you have to override getResult() method in Power 
class and calculate power of two values and return it as well as SearchDigit and you have to override 
getResult() consider first parameter of setValue() is number and second parameter is digit and you 
have to search digit in number and return it and if digit not found return -1 */

/*abstract class Value
{
	int a;
	int b;
	void setvalue(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	abstract int getresult();

}

class Power extends Value
{
	int p = 1;
	int i = 1;
	int getresult()
	{
		System.out.printf("power is\n");
		while(i<=b)
		{
			p = p * a;
			i++;
		}
		return p;
	}
}
class Searchdigit extends Value
{
	int rem = 0;
	int flag = 0;
	int getresult()
	{
		
		while(a!=0)
		{
			rem = a % 10;
			a = a/10;
			if(rem == b)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			return rem;
		}
		else{
			return -1;
		}
	}
}

public class ProgramPracticeOninheritance
{
	public static void main(String x[])
	{
		Power p1 = new Power();
		p1.setvalue(5,3);
		int result = p1.getresult();
		System.out.printf("%d",result);
		
		Searchdigit s1 = new Searchdigit();
		s1.setvalue(123,3);
		result = s1.getresult();
		if(result!=-1)
		{
		   System.out.printf("Digit found = %d\n",result);
		}
		else{
		   System.out.printf("\nDigit Not found = %d",result);
		}
	}
}*/

/* Q7. Write Program to create class name as ArrAbs with two methods  
void setArray(int arr[],int []): this function is used for accept array as parameter 
abstract int [] getResultantArray(): this function can return resultant array from different child 
classes. 
You have to create two classes name as  InterSection you have to override getResultantArray() 
method in Intersection and perform intersection of array which we pass in setArray() function and 
return it as well as you have to create one more class name as Union you have to override 
getResultantArray() and perform union on two array and return resultant array  */
/*
abstract class Arrabs
{
	int a[];
	int b[];
	void setarray(int a[],int b[])
	{
		this.a = a;
		this.b = b;
	}
	abstract int[] getresultantarray();
}
class Intersection extends Arrabs
{
	int[] getresultantarray()
	{
		int l = a.length;
		int c[] = new int[l];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					c[k++] = a[i];
				}
			}
		}
     	return c;
	}
}

class Union extends Arrabs
{
	int[] getresultantarray()
	{
		int l = a.length + b.length;
		int c[] = new int[l];
		int k = 0;
		
		for(int i=0;i<a.length;i++)
		{
			c[k++] = a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			c[k++] = b[j];
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i] == c[j])
				{
					c[j] = 0;
				}
			}
		}
	    return c;
	}
}

public class ProgramPracticeOninheritance
{
	public static void main(String x[])
	{
		int a[] = new int[]{1,2,3,4,5,6};
		int b[] = new int[]{2,3,6,8,5,7};
		
		Intersection i1 = new Intersection();
		i1.setarray(a,b);
		int[] result = i1.getresultantarray();
		System.out.printf("\nIntersection is\n");
		for(int i=0;i<result.length;i++)
		{
			if(result[i]!=0)
			System.out.printf("%d",result[i]);
		}
		
		Union u1 = new Union();
		u1.setarray(a,b);
		int[] resul = u1.getresultantarray();
		System.out.printf("\nUnion is\n");
		for(int i=0;i<resul.length;i++)
		{
			if(resul[i]!=0)
			{
			   System.out.printf("%d",resul[i]);
			}
		}
	}
}*/

/* Q8. Write program to create interface name as CharOperator with method 
void setCharArr(char []): this function is used for accept array as parameter  
char [] getArrResult(): this is abstract function and return character array as result. 
You have to create two implementer class name as ConvertToUpper and ChangeAlterNateChar you 
have to implement the CharOperator interface in ConvertToUpper class and override both methods 
and convert lower case character to upper case and you have to implement the CharOperator in 
ChangeAlterNateChar and override both methods and convert even position character as Upper and 
odd position characters in lower.*/

/*interface CharOperrator
{
	void setchararr(char ch[]);
	char[] getarrayresult();
}

class ConvertToUpper implements  CharOperrator
{
	private char ch[];
	public void setchararr(char ch[])
	{
		this.ch=ch;
	}
		public char[] getarrayresult()
		{
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i] = (char)(ch[i] -32);
				}
			}
			return ch;
		}
}

class ChangeAlterNateChar implements  CharOperrator
{
	private char ch[];
	public void setchararr(char ch[])
	{
		this.ch=ch;
	}
	public char[] getarrayresult()
		{
			
			for(int i=1;i<ch.length;i++)
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					if(ch[i]%2==0)
					{
						ch[i] = (char)(ch[i]-32);
					}
				}				
			}
			return ch;
		}
}

public class ProgramPracticeOninheritance
{
	public static void main(String x[])
	{
		ConvertToUpper c1 = new ConvertToUpper();
		c1.setchararr(new char[]{'p','r','a','v','i','n'});
		char[] result = c1.getarrayresult();
		System.out.printf("\nUppercase char is\n");
		for(int i=0;i<result.length;i++)
		{
			System.out.printf("%c",result[i]);
		}
		
		ChangeAlterNateChar c2 = new ChangeAlterNateChar();
		c2.setchararr(new char[]{'p','r','a','v','i','n'});
		char[] res = c2.getarrayresult();
		System.out.printf("\nalter nate char is\n");
		for(int i=0;i<res.length;i++)
		{
			System.out.printf("%c",res[i]);
		}
	}
}*/

/*Q9. Write a program to create Demonstrate code for multiple inheritance using interface. 
 */
		interface animal
		{
			void eat();
		}