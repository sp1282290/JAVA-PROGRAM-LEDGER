package array_Basics;

import java.util.Arrays;

public class MainDataArrayValueInSingleLine {
public static void main(String[] args) {
	String names [] = {"Rajat","Rat","Catty","Zatty","Fatty","Matty"};
	Arrays.stream(names)
	.forEach(System.out::println);
}
}
