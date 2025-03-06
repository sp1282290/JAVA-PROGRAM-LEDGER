// Use Friendly Array Program
package array_Basics;

import java.util.Scanner;

public class takingInputForcreatingArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Plaese enter size of array : ");// Populating the array
	int size = sc.nextInt();
	int [] marks= new int [size];
	
	System.out.println("Please enter array elements : ");
	for(int i = 0; i< marks.length;i++) {
		marks[i] =sc.nextInt();
	}
	
	System.out.println("Array Elements: ");
	for(int i =0; i<marks.length; i++) {
		System.out.println(marks[i]);
	}
}
}
