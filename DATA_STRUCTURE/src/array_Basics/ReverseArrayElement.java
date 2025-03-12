package array_Basics;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Ask user for array size and create the array
       int size = scanner.nextInt();
        int [] arr = new int[size];
        int [] arr1 = new int[size];
        // TODO: Populate the array with user input
        for(int i = 0; i< size; i++) {
            arr[i] = scanner.nextInt();
        }
        // TODO: Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));
        // TODO: Reverse the array
        for(int i = 0 ; i < size ; i++) {
        arr1[i] = arr[(size-1)-i];
        }
        // TODO: Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr1));
        scanner.close();
    }
}