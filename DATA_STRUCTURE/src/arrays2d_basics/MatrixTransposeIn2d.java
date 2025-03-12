package arrays2d_basics;
import java.util.Scanner;
public class MatrixTransposeIn2d {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input: Rows and Columns
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int matrix[][] = new int[rows][cols];
	        int transpose[][] = new int[cols][rows]; // Transposed matrix

	        // Input: Matrix Elements
	        System.out.println("Enter the matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }
	        // Original Matrix
	        System.out.println("Original Array:");
			for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
			System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			}

	        // Compute Transpose
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transpose[j][i] = matrix[i][j]; // Swap row with column
	            }
	        }
	        

	        // Output: Transposed Matrix
	        System.out.println("Transpose of the matrix:");
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                System.out.print(transpose[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}

