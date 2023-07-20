package matrix_product_scalar;

import java.util.Scanner;
/*
	 * You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
	
	
	Input 1:
	
	A = [[1, 2, 3],
		[4, 5, 6],
		[7, 8, 9]]
	
	B = 2
	
	Input 2:
	
	A = [[1]]
	
	B = 5
	
	Output 1:
	
	[[2, 4, 6],
	[8, 10, 12],
	[14, 16, 18]]
	
	Output 2:
	
	[[5]]
 */

public class Matrix_product {
	
	private static void display(int[][] array, int row, int column) {
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	private static void matrix_product(int[][] array,int row,int column, int scalar) {
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=array[i][j]*scalar;
			}
		}
		display(array,row,column);
	}

	

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];			
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		int scalar=scanner.nextInt();
		matrix_product(array,row,column,scalar);

	}


}
