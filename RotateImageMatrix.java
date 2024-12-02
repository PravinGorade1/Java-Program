
import java.util.*;

class RotateImage
{
  char s[][];
  void setImage(char ch[][])
  {
    s=ch;
   }
  void rotateImage()
  {
     System.out.println("Rotate Image");
    for(int i=2;i>=0;i--)
   {
      for(int j=2;j>=0;j--)
     { 
        System.out.print(s[i][j]);
     }
    System.out.println();  
   }
   
  }
}
public class RotateImageMatrix
{
  public static void main(String x[])
  {
    char ch[][]=new char[][]{
                             {'A','B','C'},
							 {'D','E','F'},
                             {'G','H','I'}
                              };
   RotateImage ri=new RotateImage();
   ri.setImage(ch);
   ri.rotateImage();
  }
}