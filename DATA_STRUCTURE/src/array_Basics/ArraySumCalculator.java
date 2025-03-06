package array_Basics;

import java.util.Scanner;

public class ArraySumCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Create a 1D array of integers with size 5
        int [] arr = new int[5];
        // TODO: Populate the array with user input
        for(int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        // TODO: Calculate the sum of all elements in the array
        int sum = 0;
        for (int i =0 ; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        // TODO: Print the original array and the calculated sum
        System.out.print("Array: [");
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]);
            if(i == arr.length - 1) {
                System.out.print("]");
                break;
            }
            System.out.print(", ");    
        }
        System.out.println("\nSum: "+sum);
        scanner.close();
    }
}

