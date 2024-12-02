import java.io.*;
import java.util.*;
public class FileHandlingFreeSpace
{
	public static void main(String x[])throws IOException
	{
	  /*File f[] = File.listRoots();
      for(int i=0;i<f.length;i++)
	  {
        long totalspace = f[i].getTotalSpace();
		System.out.printf(f[i]+""+totalspace/1073741824+"GB\n");
		long freespace = f[i].getFreeSpace();
		System.out.println(f[i]+""+freespace/1073741824+"GB");
		
	  }	*/
       
	   /*File f = new File("C:/Users/gorad/Documents/praving");
	   boolean b = f.mkdir();
	   if(b)
	   {
		   System.out.println("file created..");
	   }else{
		   System.out.println("Some promblem be their..");
	   }*/
	   
	 /*  File f = new File("C:/Users/gorad/Documents/pravink");
	   boolean check = f.exists();
	   
	   if(check)
	   {
		   System.out.println("file allready exists");
	   }else{
		   boolean b = f.mkdir();
		   if(b)
		   {
			  System.out.println("file created.."); 
		   }else{
			   System.out.println("some problem be their..");
		   }
	   }*/
	   
	  /* File f = new File("C:/Users/gorad/Documents");
	   File list[] = f.listFiles();
	   
	   for(int i=0;i<list.length;i++)
	   {
		   System.out.println(""+list[i]);
	   }*/
	  
     	/*File f = new File("C:/Users/gorad/Documents");
         File list[] = 	f.listFiles();
        
        for(int i=0;i<list.length;i++)
		{
           if(list[i].isFile())
		   {
			   System.out.println(list[i]);
		   }
		}*/	

       /* File f = new File("C:/Users/gorad/Documents");
         File list[] = 	f.listFiles();
        
        for(int i=0;i<list.length;i++)
		{
           if(list[i].isDirectory())
		   {
			   System.out.println(list[i]);
		   }
		}*/

        /*	File f = new File("C:/Users/gorad/Documents/pravinm");
            boolean b = f.createNewFile();
            if(b)
			{
             System.out.printf("file created");
			}else{
             System.out.println("some issue");
			}*/		
			
			//FileWriter(String path): 
			/*FileWriter f = new FileWriter("C:/Users/gorad/Documents/pravinm");
			Scanner abc = new Scanner(System.in);
			System.out.println("enter the string");
			String data = abc.nextLine();
			f.write(data);
			f.close();*/
			
			//BufferedWriter(Writer): 
			/*FileWriter fw = new FileWriter("C:/Users/gorad/Documents/pravinm",true); 
			BufferedWriter bw = new BufferedWriter(fw);
			Scanner abc = new Scanner(System.in);
			System.out.println("enter the String");
			String data = abc.nextLine();
			bw.write(data);
			bw.newLine();
			bw.close();
			System.out.println("data save success....");*/
			
			
			//FileReader();
			/*FileReader fr = new FileReader("C:/Users/gorad/Documents/pravinm");
			int data;
			
			while((data=fr.read())!= -1)
			{
				System.out.println(data);
				System.out.print((char)data);
			}*/
			
			
			/*Write a Java  program to read numbers from a file and write even, 
			odd and prime numbers to separate file.*/
			
			/*FileReader fr  = new FileReader("C:/Users/gorad/Documents/pravinm");
			FileWriter fr1 = new FileWriter("C:/Users/gorad/Documents/pravineven",true);
            FileWriter fr2 = new FileWriter("C:/Users/gorad/Documents/pravinodd",true);
			FileWriter fr3 = new FileWriter("C:/Users/gorad/Documents/pravinprime",true);

            int data;
            while((data = fr.read()) != -1)
			{
              if(data%2==0)
			  {
				  fr1.write(data);
			  }
			  if(data%2!=0)
			  {
				  fr2.write(data);
			  }
			  
              int count=0;
              for(int i=1;i<=data;i++)
			  {
				  if(data%i==0)
				  {
					  count++;
				  }
			  }
			  if(count==2)
			  {
				  fr3.write(data);
			  }
			}
			fr1.flush();
            fr1.close();
			fr2.flush();
            fr2.close();
			fr3.flush();
			fr3.close();*/
			
			/* Write a Java  program to compare two files.*/
			/*FileReader fr = new FileReader("C:/Users/gorad/Documents/pravinm");
			FileReader fr1 = new FileReader("C:/Users/gorad/Documents/pravinm");
			int data,data1;
			
			while((data=fr.read())!= -1 && (data1=fr1.read())!= -1)
			{
				if(data == data1)
				{
					System.out.println("file are equal");	
					break;
				}else{
					
				System.out.println("file are not equal");
				break;
				}
			}
					fr.close();
					fr1.close();*/
					
		/*Write a Java program to copy contents from one file to another file.*/
		FileReader fr = new FileReader("C:/Users/gorad/Documents/pravinm");
		FileReader fr1 = new FileReader("C:/Users/gorad/Documents/pravineven");
		
		fr = fr1;
		
	}
}