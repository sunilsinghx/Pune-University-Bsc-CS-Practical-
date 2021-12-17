//operation on multi dimension array

import java.util.Arrays;
import java.util.Scanner;

public class Matrix
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int a[][] = {{5,6,7},{8,9,10},{3,1,2}};	//initalize a 
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};	//initalize b
		
		int c[][] = new int[3][3];

		System.out.println("A = "+Arrays.deepToString(a));
		System.out.println("B = "+Arrays.deepToString(b));

		int choice;

		do
		{
			System.out.println("\nChoose the Matrix Operation");
			System.out.println("---------------------------------");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Transpose");

			System.out.println("Enter Your Choice: ");
			choice = scan.nextInt();

			switch(choice)
			{
				case 1:		//add
					c = add(a,b);
					System.out.println("Sum of Matrix: ");
					System.out.println(Arrays.deepToString(c));
					break;
				case 2:		//subtract
					c = subtract(a,b);
					System.out.println("Subtraction of Matrix: ");
					System.out.println(Arrays.deepToString(c));
					break;
				case 3:	//Multiplication
					c = multiply(a,b);
					System.out.println("Multiplication of Matrix: ");
					System.out.println(Arrays.deepToString(c));
					break;
				case 4:		//Transpose
					System.out.println("Transpose of A's Matrix");
					c = transpose(a);
					System.out.println(Arrays.deepToString(c));
					System.out.println("Transpose of B's Matrix: ");
					c = transpose(b);
					System.out.println(Arrays.deepToString(c));
					break;

				default:
					System.out.println("Invalid Input");
			}
		}while(choice != 5);
	}
	//-----------------------function declaration starts----------
	public static int[][] add(int a[][],int b[][])	//addition
	{
		int row = a.length;		//gets number of elements in row of a
		int column = a[0].length;	//gets number of elements in collumn of a 	
		int sum[][] = new int[row][column];

		for(int i =0; i < row; i++)
			for(int j =0; j < column; j++)
				sum[i][j] = a[i][j] + b[i][j];

		
		return sum;
	}

	public static int[][] subtract(int a[][],int b[][])	//Substract
	{
		int row = a.length;		//gets number of elements in row of a
		int column = a[0].length;	//gets number of elements in collumn of a 	
		int sub[][] = new int[row][column];

		for(int i =0; i < row; i++)
			for(int j =0; j < column; j++)
				sub[i][j] = a[i][j] - b[i][j];

		
		return sub;
	}
	
	public static int[][] multiply(int a[][],int b[][])	//Multiplication
	{
		int row = a.length;		//gets number of elements in row of a
		int column = b[0].length;	//gets number
		int product[][] = new int[row][column];


		for(int i =0; i < row; i++)
		{
			for(int j =0; j < column; j++)
			{
				product[i][j] = 0;
				for(int k =0; k < a[0].length; k++)
				{
					product[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		return product;
	}

	public static int[][] transpose(int[][] a)	//transpose
	{
		int row = a.length;
		int column = a[0].length;
		int temp[][] = new int[row][column];

		for(int i =0; i< row; i++)
		{
			for(int j =0 ; j < column; j++)
			{
				temp[i][j] = a[j][i];
			}
		}
		return temp;
	}
}

