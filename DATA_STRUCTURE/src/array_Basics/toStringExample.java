package array_Basics;

import java.util.Scanner;
import java.util.Arrays; // Importing Arrays class

public class toStringExample{
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
  System.out.println("Array: "+Arrays.toString(arr)); /* Arrays.toString is a inbuilt library which help to print the output
  in this format by default  [5, 6, 6, 89, 55] only we have to call the library*/
          
  System.out.println("Sum: "+sum);
        scanner.close();
    }
}