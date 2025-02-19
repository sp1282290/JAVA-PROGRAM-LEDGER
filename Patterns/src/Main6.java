/* Method Overloading: Method overloading in Java is a feature that allows a class to have multiple methods
 *  with the same name but different parameters.
This helps improve code readability and reusability.*/
public class Main6 {
public static void main(String[] args) {
	Calculator calc = new Calculator();
		calc.add(4, 5);  //add() can add 2 integers
		calc.add(4,5,6); // add() can add 3 integers
		calc.add(4,5.1);  //add() can add 1 integer, 1 double.
		calc.add(5.1,6.1,3.1); //add() can add 3 double values.

	}

}
