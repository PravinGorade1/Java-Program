import java.util.*;
class Player
{
	private int id;
	private String name;
	private int run;
	
	Player(int id,String name,int run)
	{
		this.id = id;
		this.name = name;
		this.run = run;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
	   return name;	
	}
	public int getrun()
	{
		return run;
	}
 } 
 
  class Playerdetail
  {
	  private Player p[];
	  
	  public void showdetail(Player p[])
	  {
		 this.p = p;
	  }
	  public void sortArray()
	  {
		  for(int i=0;i<p.length;i++)
		  {
			  for(int j=i+1;j<p.length;j++)
			  {
				  if(p[i].getrun() > p[j].getrun())
				  {
					  Player temp = p[i];
					  p[i] = p[j];
					  p[j] = temp;
				  }
			  }
		  }
	  }
	  
	  public void deletename(String name)
	  {
		  for(int i=0;i<p.length;i++)
		  {
			  if(p[i].getname().equals(name))
			  {
				  p[i] = null;
			  }
		  }
		  
		  for(int i=0;i<p.length;i++)
		  {
		     if(p[i] != null)
			  {
				System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getrun());
			  }
		  }
	  }
  }
 
 public class PlayerRec
 {
	 public static void main(String x[])
	 {
		 Player p[] = new Player[5];
		 for(int i=0;i<p.length;i++)
		 {
			 Scanner abc = new Scanner(System.in);
			 System.out.println("enter the name of the player");
			 String name = abc.nextLine();
			 System.out.println("enter the id of the player");
			 int id = abc.nextInt();
			 System.out.println("enter the run of the player");
			 int run = abc.nextInt();
			 p[i] = new Player(id,name,run);
		 } 
		  Scanner abc = new Scanner(System.in);
		  System.out.println("enter the name to delete");
		  String name = abc.nextLine();
		  
		  Playerdetail pl = new Playerdetail();
		  pl.showdetail(p);
		  pl.sortArray();
		  pl.deletename(name);
	 }
 }
	 