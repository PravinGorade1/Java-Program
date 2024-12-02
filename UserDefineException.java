
class ExeCheck extends NullPointerException
{   String getsum(){
	   return "I am eception";
    }
}

class Check
{
	void get(int no)
	{
		if(no%2==0)
		{
			ExeCheck e = new ExeCheck();
			throw e;
		}else{
			System.out.println("odd number");
		}
	}
}

public class UserDefineException
{
	public static void main(String x[])
	{
		try{
			Check c = new Check();
			c.get(6);
		}
		catch(ExeCheck m)
		{
		  System.out.println("error is"+m.getsum());
		}
	}
}