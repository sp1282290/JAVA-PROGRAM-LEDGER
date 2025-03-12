package arrays2d_basics;

import java.util.Scanner;

public class dynamic_userInput_2d_array {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
System.out.print("Enter the no. of rows: ");
int rows= scanner.nextInt();
System.out.print("Enter the no. of columns: ");
int columns= scanner.nextInt();
int [][] arr = new int[rows][columns];
System.out.println("Enter the number in array: ");
for(int i=0;i<rows;i++) {
	for(int j=0;j<columns;j++) {
		System.out.print("Elements at positions ("+ i +", "+ j +") are: ");
		arr[i][j]=scanner.nextInt();
	}
}
	System.out.println("\nThe 2d array are: ");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
		}
}