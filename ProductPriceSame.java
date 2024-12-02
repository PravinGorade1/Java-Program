/*WAP to Create class name as Product as POJO with field id,name and 
price create array of object of product of size 10 and find the 
product whose price is same.*/
import java.util.*;
class Product
{
	private String name;
	private int id;
	private int price;
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
	
	void setprice(int price)
	{
		this.price=price;
	}
	int getprice()
	{
		return price;
	}
}
   
   public class ProductPriceSame
   {
	   public static void main(String x[])
	   {
		  Product p[] = new Product[3];
          for(int i=0;i<p.length;i++)
		  {
            p[i] = new Product();
			Scanner abc = new Scanner(System.in);
			System.out.printf("enter the name id and prise of product\n");
			
			String name = abc.nextLine();
			int id  = abc.nextInt();
			int price = abc.nextInt();
			
			p[i].setname(name);
			p[i].setid(id);
			p[i].setprice(price);
		  }

         System.out.printf("\nshow product\n");
		  System.out.println("================================================");
		  for(int i=0;i<p.length;i++)
		  { 
			  System.out.println();
			  System.out.printf(p[i].getname()+"\t"+p[i].getid()+"\t"+p[i].getprice());
		  }
		  System.out.println("================================================");
		  
		  
		   System.out.printf("\nshow  same product\n");
		    System.out.println("================================================");
			
		  for(int i=0;i<p.length;i++)
		  {
			  if(p[i].setprice!=0)
			  {
			     for(int j=i+1;j<p.length;j++)
			     {
                  if(p[i].getprice() == p[j].getprice())
			      {
			       System.out.println();
			       System.out.printf(p[i].getname()+"\t"+p[i].getid()+"\t"+p[i].getprice());
				   //  System.out.printf(p[j].getname()+"\t"+p[j].getid()+"\t"+p[j].getprice());00
				   p[i].setprice=0;
			      }
			     }
			  }
		  }
           	   
            System.out.println("================================================");		  
	   }
   }