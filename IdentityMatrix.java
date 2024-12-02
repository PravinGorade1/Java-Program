/*48)Write a program in C to check whether a given matrix is an identity matrix. 
Test Data : 
Input number of Rows for the matrix :3 
Input number of Columns for the matrix :3 
Input elements in the first matrix : 
element - [0],[0] : 1 
element - [0],[1] : 0 
element - [0],[2] : 0 
element - [1],[0] : 0 
element - [1],[1] : 1 
element - [1],[2] : 0 
element - [2],[0] : 0 
element - [2],[1] : 0 
element - [2],[2] : 1 
Expected Output : 
The matrix is : 
1 0 0 
0 1 0 
0 0 1 
The matrix is an identity matrix. */

import java.util.*;
public class IdentityMatrix
{
	public static void main(String x[])
	{
		Scanner k = new Scanner(System.in);
		System.out.printf("enter the row and column of the first matrix");
		int row1 = k.nextInt();
		int column1 = k.nextInt();
		
		int matrix1[][] = new int[row1][column1];
		
		System.out.printf("enter the value in first matrix");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=k.nextInt();
			}
		}
		
		System.out.println("The first matrix is:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        } 
		
		int isIdentity = 1;
    for (int i = 0; i < row1; i++)
		{
        for (int j = 0; j < column1; j++)
			{
            if (i == j && matrix1[i][j] != 1)
				{
                isIdentity = 0;
                break;
               }
			else if (i != j && matrix1[i][j] != 0)
				{
                isIdentity = 0;
                break;
            }
        }
	}
	
		 if (isIdentity==1) 
		 {
            System.out.println("The matrices are Idetity.");
         } 
		else 
		{
            System.out.println("The matrices are not identity.");
        }
	
 }
}
					
		
