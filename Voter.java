/*Ward with field wardId,wardName,Voter  and Ward is POJO class so it contain 
void setWardId(int wardId)
int getWardId()
void setWardName(String name)
String getWardName()
void setVoter(Voter …voter)
Voter [] getVoter(); 

Here you have to create POJO class name as Voter with field 
id,name,age and you have to create one more class name as 
VotingMachine with following methods 

void setWards(Ward …w): this method can more than one wards
void showVotingCount(): this method can show the voting ward wide and consider voter whose age is greater than 18.

VotingMachingApplication contain main method 
Output Like as */

import java.util.*;
class Ward
{
	private String wardname;
	private int wardid;
	private int voter;
	
	void setwardname(String wardname)
	{
		this.wardname=wardname;
	}
	String getwardname()
	{
		return wardname;
	}
	
	void setwardid(int wardid)
	{
		this.wardid=wardid;
	}
	int getwardid()
	{
		return wardid;
	}
	
	void setvoter(Voter ...voter)
	{
		this.voter=voter;
	}
	int getvoter()
	{
		return voter;
	}
}
 class Voter
 {
	private String votername;
	private int voterid;
	private int voterage;
	
	void setvotername(String name)
	{
		this.votername=votername;
	}
	String getvotername()
	{
		return votername;
	}
	
	void setvoterid(int voterid)
	{
		this.voterid=voterid;
	}
	int getvoterid()
	{
		return id;
	}
	void setvoterage(int voterage)
	{
		this.voterage=voterage;
	}
	int getvoterage()
	{
		return voterage;
	}	
 }	
 
 class VotingMachine
 {
	private Ward[] w;
	private Voter[] v;
	public void setward(Ward ...w)
	{
		this.w=w;
	}
	public void showward()
	{
	  System.out.println("=================================");
	  System.out.println("ward and voters");
	  int count=0;
	  for(int i=0;i<w.length;i++)
	  {
		  System.out.println("===============================================================");
		  Syatem.out.println("name"+w[i].getname()+"\tid"+w[i].getid()+"\tvoter"+w[i].getVoter());
		  v=w[i].getvoter();
		  System.out.println("==============================================================");
	  
	      for(int j=0;j<v.length;j++)
	      {
		    if(v[j].getage()>=18)
		     {
			  System.out.println("name"+v[j].getname()+"\tid"+v[j].getid()+"\tage"+v[j].getage());
			  count++;
		     }
	      }
	  }
	    System.out.prinln("==============================================================");
		System.out.prinln("Total votings ==>"+count);
    }
 }
 
  public class Voter
  {
	  public static void main(String x[])
	  {
		  VotingMachine v = new VotingMachine();
		  Voter v1 = new Voter();
		  v1.setvotername("pravin");
		  v1.setvoterid(1);
		  v1.setvoterage(22);
		  
		  Voter v2 = new Voter();
		  v2.setvotername("ram");
		  v2.setvoterid(3);
		  v2.setvoterage(23);
		  
		  Voter v3 = new Voter();
		  v3.setvotername("krishna");
		  v3.setvoterid(5);
		  v3.setvoterage(21);
		  
		  Ward w1 = new Ward();
		  w1.setWardName("hanuman galli");
		  w1.setWardId(1);
		  w1.setvoter(v1,v2,v3);
		  
		  Voter v4 = new Voter();
		  v4.setvotername("pavan");
		  v4.setvoterid(9);
		  v4.setvoterage(27);
		  
		  Voter v5 = new Voter();
		  v5.setvotername("ravi");
		  v5.setvoterid(7);
		  v5.setvoterage(23);
		  
		  Ward w2 = new Ward();
		  w1.setWardName("tapovan galli");
		  w1.setWardId(2);
		  w1.setvoter(v4,v5);
		  
		  v.setward(w1,w2);
		  v.setward();
	  }
  }
		  
 
 
  
	
		


 

