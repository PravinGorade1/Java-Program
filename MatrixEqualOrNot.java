/*47)Write a program in C to accept two matrices and check whether they are equal 
Test Data : 
Input Rows and Columns of the 1st matrix :2 2 
Input Rows and Columns of the 2nd matrix :2 2 
Input elements in the first matrix : 
element - [0],[0] : 1 
element - [0],[1] : 2 
element - [1],[0] : 3 
element - [1],[1] : 4 
Input elements in the second matrix : 
element - [0],[0] : 1 
element - [0],[1] : 2 
element - [1],[0] : 3 
element - [1],[1] : 4 
Expected Output : 
The first matrix is : 
1 2 
3 4 
The second matrix is : 
1 2 
3 4 
The Matrices can be compared : 
Two matrices are equal. */

import java.util.*;
public class MatrixEqualOrNot
{
	public static void main(String x[])
	{
		Scanner k = new Scanner(System.in);
		System.out.printf("enter the row and column of the first matrix");
		int row1 = k.nextInt();
		int column1 = k.nextInt();
		
		System.out.printf("enter the row and column of the second matrix");
		int row2 = k.nextInt();
		int column2 = k.nextInt();
		
		int matrix1[][] = new int[row1][column1];
		int matrix2[][] = new int[row2][column2];
		
		System.out.printf("enter the value in first matrix");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=k.nextInt();
			}
		}
		
     System.out.printf("enter the value in second matrix");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<column2;j++)
			{
				matrix2[i][j]=k.nextInt();
			}
		}
		
		System.out.println("The first matrix is:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
		
		System.out.println("The first matrix is:");
        for (int i = 0; i < row2; i++)
			{
            for (int j = 0; j < column2; j++) 
			{
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
		  int areEqual=1;
		for (int i = 0; i < row1; i++) 
		{
            for (int j = 0; j < column1; j++) 
			{
                if (matrix1[i][j] != matrix2[i][j]) 
				{
					areEqual=0;
				}
			}
		}
		
		 if (areEqual==1) 
		 {
            System.out.println("The matrices are equal.");
         } 
		else 
		{
            System.out.println("The matrices are not equal.");
        }
	}
}
					
		
