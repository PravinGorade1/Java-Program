class Player
{
	private int id;
	private String name;
	private int runs;
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
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	
	void setruns(int runs)
	{
		this.runs = runs;
	}
     int getruns()
	 {
		 return runs;
	 }
}
  
  class Team
  {
     void addPlayer(Player...p)	
	 {
        for(int i=0;i<p.length;i++)
		{
			System.out.println();
			System.out.printf("id\t name\t runs");
			System.out.printf(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getruns());
		}
	 }
	 	 
  }
  
  public class PlayerApplication
  {
	  public static void main(String x[])
	  {
		 Team t = new Team();
         Player p = new Player();		 
		 p.setid(1);
		 p.setname("pravin");
		 p.setruns(1000);
		 
		 Player p1 = new Player();		 
		 p1.setid(1);
		 p1.setname("pravin");
		 p1.setruns(1000);
		 
		 t.addPlayer(p,p1);
		 
	  }
  }