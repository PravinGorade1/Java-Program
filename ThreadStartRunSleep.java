import java.util.*;
class A extends Thread {
    //using join first thread coplete then start second
    public void run() {
        try {
            for(int i = 1; i <= 20; i++) {
                System.out.printf("First thread is %d \n", i);
                Thread.sleep(100);
            }
        } catch (Exception ex) {
            System.out.println("Error is\n" + ex);
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for (int j = 1; j <= 20; j++) {
                System.out.printf("Second thread is %d \n", j);
                Thread.sleep(100);
            }
        } catch (Exception ex) {
            System.out.println("Error is\n" + ex);
        }
    }
}

public class ThreadStartRunSleep {
    public static void main(String x[])throws InterruptedException  {
        A a = new A();
        a.start();
        a.join();
        B b = new B();
        b.start();
    }
}

      /*boolean isAlive():*/
	/*class A extends Thread{
		public void run(){
			try{
				for(int i=1;i<=10;i++)
				{
					System.out.printf("First thread is %d\t%b\n",i,isAlive());
					if(i==3)
					{
						stop();
					}
					Thread.sleep(10000);
				}
			}
			catch(Exception ex){
				System.out.println("Exception is"+ex);
			}
		}
	}
	
	class B extends Thread{
		public void run(){
			try{
				for(int i=1;i<10;i++)
				{
					System.out.printf("Second thread id %d\n",i);
					Thread.sleep(1000);
				}
			}
			catch(Exception ex)
			{
				System.out.println("error is"+ex);
			}
		}
	}
	
	public class ThreadStartRunSleep {
		public static void main(String x[])throws InterruptedException  {
         A a = new A();
		 a.start();
		 a.join();
		 System.out.println("status of a1 is"+a.isAlive());
		 B b = new B();
		 
		}
	}*/
	
	
	/*asynchronized
	start one by one*/
	/*class Table{
		void showTable(int no)
		{
			try{
				for(int i=1;i<=10;i++)
				{
					System.out.printf("%d X %d = %d\n",i,no,i*no);
					Thread.sleep(100);
				}
			}
			catch(Exception ex)
			{
				System.out.println("error is"+ex);
			}
		}
	}
		class Two extends Thread
		{
			Table table;
			void setTable(Table t)
			{
				table = t;
			}
			public void run(){
				table.showTable(2);
			}
		}
		class Three extends Thread
		{
			Table table;
			void setTable(Table t)
			{
				table = t;
			}
			public void run()
			{
				table.showTable(3);
			}
		}
	
	public class ThreadStartRunSleep {
		public static void main(String x[])throws InterruptedException  {
		 
		 Table t = new Table();
		 
		 Two tw = new Two();
		 tw.setTable(t);
		 tw.start();
		 
		 Three tr = new Three();
		 tr.setTable(t);
		 tr.start();
		}
	}*/
	
	/*synchronized
	first complited then start second*/
	/*class Table{
		   synchronized void showTable(int no)
		{
			try{
				for(int i=1;i<=10;i++)
				{
					System.out.printf("%d X %d = %d\n",i,no,i*no);
					Thread.sleep(1000);
				}
			}
			catch(Exception ex)
			{
				System.out.println("error is"+ex);
			}
		}
	}
		class Two extends Thread
		{
			Table table;
			void setTable(Table t)
			{
				table = t;
			}
			public void run(){
				table.showTable(2);
			}
		}
		class Three extends Thread
		{
			Table table;
			void setTable(Table t)
			{
				table = t;
			}
			public void run()
			{
				table.showTable(3);
			}
		}
	
	public class ThreadStartRunSleep {
		public static void main(String x[])throws InterruptedException  {
		 
		 Table t = new Table();
		 
		 Two tw = new Two();
		 tw.setTable(t);
		 tw.start();
		 
		 Three tr = new Three();
		 tr.setTable(t);
		 tr.start();
		}
	}*/
	
		/*Example of conditional wait
		wait 5 and start second to 5*/
	/*class Table
	{
	   synchronized void showTable(int no)
	   {
		  try{
			 for(int i=1; i<=10; i++)
			 {
				System.out.printf("%d X %d = %d\n",i,no,i*no);
				if(i==5)
				{ wait(1000);
				}
				Thread.sleep(1000);
			 }
		  }
		  catch(Exception ex)
		  { System.out.println("Error is "+ex);
		  }
	   }
	}
	class Two extends Thread
	{  Table table;
	   void setTable(Table t)
	   { table=t;
	   }
	   public void run(){
		  table.showTable(2);
	   }
	}
	class Three extends Thread
	{ Table table;
	   void setTable(Table t)
	   { table=t;
	   }
	   public void run(){
		  table.showTable(3);
	   }
	}
	public class ThreadStartRunSleep
	{
		public static void main(String x[])
		{
			Table t1 = new Table();
			 
			Two tw = new Two();
			tw.setTable(t1);
			tw.start();
			
			Three th = new Three();
			th.setTable(t1);
			th.start();
		}
	}*/

	/*Notifyall*/
	/*user choice stop and start*/
	/*class Table
	{
		synchronized  void showTable(int no)
		{
		   try{
			   for(int i=1;i<=10;i++)
			   {
				   System.out.printf("%d X %d = %d\n",i,no,i*no);
				   if(i == 5)
				   {
					   wait();
				   }
			   }
		   }
		   catch(Exception ex)
		   {
			   System.out.println("errror is"+ex);
		   }
		}
		
		synchronized void rejoin()
		{
			try{
				notifyAll();
			}
			catch(Exception ex)
			{
				System.out.println("error is"+ex);
			}
		}
	}
	
	class Two extends Thread
	{
		Table table;
		void setTable(Table t)
		{
			table = t;
		}
		public void run()
		{
			table.showTable(2);
		}
	}
	
	class Three extends Thread
	{
		Table table;
		void setTable(Table t)
		{
			table = t;
		}
		public void run()
		{
			table.showTable(3);
		}
	}

	public class ThreadStartRunSleep
	{
		public static void main(String x[])
		{
			Table t = new Table();
			
			Two tw = new Two();
			tw.setTable(t);
			tw.start();
			
			Three tr = new Three();
			tr.setTable(t);
			tr.start();
			
			do{
				Scanner abc = new Scanner(System.in);
				String value = abc.nextLine();
				if(value.equals("restart"))
				{
					t.rejoin();
				}
			}while(true);
			
		}
	}*/