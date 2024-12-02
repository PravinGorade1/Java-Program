/*WAP to create POJO class name as Book with field id,
name and price and create 5 objects of book class 
using array of objects and arrange all books in 
descending order by using its price.*/
import java.util.*; 
class Book
{
	private int id;
	private String name;
	private int price;
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
	
	void setprice(int price)
	{
		this.price=price;
	}
	int getprice()
	{
		return price;
	}
}
 
  public class BookApp
  {
	  public static void main(String x[])
	  {
		  Book b[] = new Book[5];
		  for(int i=0;i<b.length;i++)
		  {
		    Scanner abc = new Scanner(System.in);
			b[i] = new Book();
			System.out.printf("enter the id name and price");
			int id = abc.nextInt();
			abc.nextLine();

			String name = abc.nextLine();
			int price = abc.nextInt();
			
			b[i].setid(id);
			b[i].setname(name);
			b[i].setprice(price);
		  }
		  System.out.printf("Display all Book data");
		  for(int i=0;i<b.length;i++)
		  {
			  System.out.println();
			  System.out.println(b[i].getid()+"\t"+b[i].getname());
		  }
		  
		 
		  for(int i=0;i<b.length;i++)
		  {
			  for(int j=i+1;j<b.length;j++){
		         if(b[i].getprice()<b[j].getprice())
			     {
				  Book temp=b[i];
				  b[i]=b[j];
				  b[j]=temp;
			     }
			  }
		  }
		  System.out.printf("Assending order book is");
		  for(int i=0;i<b.length;i++)
		  {
			  System.out.println();
			  System.out.printf(b[i].getid()+"\t"+b[i].getname()+"\t"+b[i].getprice());
		  }
				  
	  }
  }
		  