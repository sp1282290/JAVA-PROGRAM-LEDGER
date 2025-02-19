//write a java program for factorial using recursion.
import java.util.Scanner;
class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		Factorial f= new Factorial();
		int res = f.factorial(n);
		System.out.println(res);
	}
}
class Factorial {
 public static int factorial(int n) {
	if (n==0) {
		return 1;
	}
	else 
	{
		     int sum=n*factorial(n-1);// Activation record occur because the function is recalled.
		     return sum;
	}
}
}
// OS>JVM>MAIN>METHOD>
