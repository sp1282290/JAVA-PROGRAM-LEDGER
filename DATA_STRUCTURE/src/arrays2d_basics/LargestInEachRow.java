package arrays2d_basics;
import java.util.Scanner;

public class LargestInEachRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix size input
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Taking matrix elements input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Finding and printing the largest element in each row
        System.out.println("Largest element in each row:");
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];  // Assume first element is the largest
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];  // Update max if a larger value is found
                }
            }
            System.out.println("Row " + (i + 1) + ": " + max);
        }

        scanner.close();
    }
}

