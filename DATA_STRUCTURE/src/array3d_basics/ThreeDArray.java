package array3d_basics;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking 3D array size input
        System.out.print("Enter the number of 2D matrices (depth): ");  //  The user inputs depth (number of 2D matrices),
        int depth = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][][] array = new int[depth][rows][cols];

        // Taking input for 3D array
        System.out.println("Enter the elements of the 3D array:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Matrix " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[d][i][j] = scanner.nextInt();
                }
            }
        }

        // Printing the 3D array
        System.out.println("\nThe 3D Array is:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Matrix " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[d][i][j] + " ");
                }
                System.out.println(); // New line after each row
            }
            System.out.println(); // New line after each matrix
        }

        scanner.close();
    }
}
