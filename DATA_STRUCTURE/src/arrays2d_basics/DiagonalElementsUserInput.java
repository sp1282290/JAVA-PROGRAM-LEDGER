package arrays2d_basics;

import java.util.Scanner;

public class DiagonalElementsUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix size input (assuming a square matrix)
        System.out.print("Enter the size of the matrix (n for n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Taking matrix elements input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing main diagonal elements
        System.out.println("Main Diagonal Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        // Printing secondary diagonal elements
        System.out.println("\nSecondary Diagonal Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }

        scanner.close();
    }
}
