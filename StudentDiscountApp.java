class  Student
{
	private int id;
	private String name;
	private int marks[];
	/*private int totalfees;
	private int disfees;
	private int actualpaisfees;*/
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
	
	void setname(String name)
	{
		this.name=name;
	}
	  String getname()
	{
		return name;
	}
	
	void setmarks(int marks[])
	{
		this.marks=marks;
	}
	  int []getmarks()
	{
		return marks;
	}
	
	/*void settotalfees(int totalfees)
	{
		this.totalfees=totalfees;
	}
	   int  gettotalfees()
	{
		return totalfees;
	}
	
	void setdisfees(int disfees)
	{
		this.disfees=disfees;
	}
	   int  getdisfees()
	{
		return disfeesfees;
	}
	
	void setactualpaisfees(int actualpaisfees)
	{
		this.actualpaisfees=actualpaisfees;
	}
	   int  getactualpaisfees()
	{
		return actualpaisfees;
	}
}*/
}
   class Discountfees
   {
     private Student stu;
     void setstudnt(Student student)	
	 {
		stu=student; 
	 }
	 void getstudent()
	 {
		 int a[] = stu.getmarks();
		System.out.println("name \t id"); 
		System.out.printf(stu.getname()+"\t"+stu.getid());
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d",a[i]);
		}
		int agg=0;
		int per=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		   agg=agg+a[i];
           count++;		   
		}
		  per=agg/count;
	      System.out.printf("per is = %d\n",per);
	 }
	 
   }	  

public class  StudentDiscountApp 
{
	public static void main(String x[])
	{
		int a[] = new int[]{10,20,30,40,50};
		Discountfees d = new Discountfees();
		Student s = new Student();
		s.setname("pravin");
		s.setid(1);
		s.setmarks(a);
		d.setstudnt(s);
		d.getstudent();
	}
}
	