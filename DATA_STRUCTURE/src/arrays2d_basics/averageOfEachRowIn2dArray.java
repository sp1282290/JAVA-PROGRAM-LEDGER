package arrays2d_basics;

import java.util.Scanner;

public class averageOfEachRowIn2dArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int[][] array = new int[rows][cols];
		// Populate the array with user input
		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
		array[i][j] = scanner.nextInt();
		}
		}
		// Print the array
		System.out.println("Array:");
		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
		System.out.print(array[i][j] + " ");
		}
		System.out.println();
		}
		// Calculate and print average of each row
		for (int i = 0; i < rows; i++) {
		int sum = 0;
		for (int j = 0; j < cols; j++) {
		sum += array[i][j];
		}
		double average = (double) sum / cols;
		System.out.println("Average of row " + (i + 1) + ": " + average);
		}
		scanner.close();
		}
}


