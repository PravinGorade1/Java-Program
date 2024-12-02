class  Student
{
	private int id;
	private String name;
	private float per;
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
	
	void setname(string name)
	{
		this.name=name;
	}
	  String getname()
	{
		return name;
	}
	
	void setmarks(float marks)
	{
		this.marks=marks;
	}
	  float getmarks()
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

   class Discountfees
   {
     private Student stu[];
     void setstudnt(Student student)	
	 {
		stu=student; 
	 }
	 void getstudent()
	 {
		 int a[] = stu.getmark;
		System.out.printf("name \t id"); 
		System.out.printf(stu.getname()+"\t"+stu.getid());
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(a[i]);
		}
		int agg=0;
		int per=0;
		for(int i=0;i<a.length;i++)
		{
		   agg=agg+a[i];	
		}
		per=agg/a.lenght;
	
	 }
	 
   }	  

public class  StudentDiscountApp 
{
	public static void main(String x[])
	{
		int a[] = new int[]{10,20,30,40,50};
		Discountfees d = new Discountfees();
		Student s = new Student();
		s.setname(pravin);
		s.setid(1);
		s.setper(a);
		d.setstudnt(s);
		d.getstudent();
	}
}
	