import java.util.*;
class ProfitLoss
{
  private int sel;
  private int cost;
  void setvalue(int cost,int sel)
  {
	  this.sel=sel;
	  this.cost=cost;
  }
  void showprofitloss()
  {
	  if(cost<sel)
	  {
		  System.out.println("Profit");
	  }
	  else if(cost==sel)
	  {
		  System.out.println("nill");
	  }
	  else
	  {
		  System.out.println("loss");
	  }
  }
}
  
  public class ProfitLossApp
  {
	  public static void main(String x[])
	  {
		 Scanner abc = new Scanner(System.in);
         System.out.printf("enter the cost price");
         int cost=abc.nextInt();	

         System.out.printf("enter the selling price");
         int sel=abc.nextInt();		 
		  
		  ProfitLoss p = new ProfitLoss();
		  p.setvalue(cost,sel);
		  p.showprofitloss();
	  }
  }