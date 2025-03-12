package array_Basics;
import java.util.Scanner;
import java.util.*;

public class Maximum_Element_in_array {
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // TODO: Ask user for array size and create the array
	        int size = scanner.nextInt();
	        int [] arr = new int[size];
	        // TODO: Populate the array with user input
	        for(int i = 0; i < size; i++) {
	                arr[i] = scanner.nextInt();
	        }
	        // TODO: Find the maximum value in the array
	        int max = arr[0];
	       for(int i=0;i<arr.length;i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        // TODO: Print the original array and the maximum value
	        System.out.println("Array: " + Arrays.toString(arr));
	        System.out.println("Maximum value: " + max);
	        scanner.close();
	    }
	}
