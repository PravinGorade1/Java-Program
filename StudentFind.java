/*WAP to create POJO class name as Student 
with field id,name and per and create array 
of object student with size 5 and input the id of
 student and search student record in student object array 
and if student then display student found
 otherwise display message student not found.*/
 import java.util.*;
 class Student
 {
	 private String name;
	 private int id;
	 private int per;
	 void setname(String name)
	 {
		 this.name=name;
	 }
	  String getname()
	  {
		  return name;
	  }
	  
	  void setid(int id)
	  {
		  this.id=id;
	  }
	  int getid()
	  {
		  return id;
	  }
	  
	  void setper(int per)
	  {
		  this.per=per;
	  }
	  int getper()
	  {
		  return per;
	  }
	  
 }
 
   public class StudentFind
   {
	   public static void main(String x[])
	   {
		   Scanner abc = new Scanner(System.in);
		   Student s[] = new Student[3];
		   for(int i=0;i<s.length;i++)
		   {
			  
			   System.out.printf("\nenter the student name id and per\n");
			   s[i] = new Student();
			   int id = abc.nextInt();
			   abc.nextLine();
			   String name  = abc.nextLine();
			   int per = abc.nextInt();
			   s[i].setname(name);
			   s[i].setid(id);
			   s[i].setper(per);
		   }
		   System.out.printf("inter the input to search");
		   int input=abc.nextInt();
			   
			   System.out.printf("\nDisplay all Student Data\n");
			   for(int i=0;i<s.length;i++)
			   {
				   System.out.printf(s[i].getname()+"\t"+s[i].getid()+"\t"+s[i].getper());
			   }
			   
			   for(int i=0;i<s.length;i++)
			   {
				   if(s[i].getid()==input)
				   {
					 System.out.printf(s[i].getname()+"\t"+s[i].getid()+"\t"+s[i].getper());   
				   }
			   }
		   }
	   }