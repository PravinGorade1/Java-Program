class Per
{
	int s[],per=0;
	Per(int s[])
	{
		int agg=0;
		for(int i=0;i<s.length;i++)
		{
			agg=agg+s[i];
		}
		per = agg/s.length;
	}
}
	class CSE extends Per
	{
		String name;
		int id;
		String address;
		String year;
	  CSE(String name,int id,String address,String year,int b[])
	  {
		 super(b);
         this.name=name;
		 this.id=id;
		 this.address=address;
		 this.year=year;
	  }		 	
	   void showcseper()
	  {
		System.out.println();
		System.out.printf("name=%s\t id=%d\t address=%s\t year=%s\t per=%d\t",name,id,address,year,per);
	  }
	}

	class ETC extends Per
	{
		String name;
		int id;
		String address;
		String year;
	  ETC(String name,int id,String address,String year,int a[])
	  {
		  super(a);
		  this.name=name;
		  this.id=id;
		  this.address=address;
		  this.year=year;
	  }
	  void showETCper()
	  {
		 System.out.println();
		System.out.printf("name=%s\t id=%d\t address=%s\t year=%s\t per=%d\t",name,id,address,year,per); 
	  }
	}

public class InheritanceEnggResult
{
	public static void main(String x[])
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[]{60,70,80,90,70};
		CSE c = new CSE("pravin",1,"Nillod","2002",a);
		c.showcseper();
		ETC e = new ETC("Pavan",2,"nillod","2004",b);
		e.showETCper();
	}
}