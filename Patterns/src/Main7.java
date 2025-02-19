/* Polymorphism:  Polymorphism is a concept in object-oriented programming that allows one 
		interface to be used for different data types. In simple words, it means that a single function, method,
		 or class can behave differently depending on the object it is acting upon.*/
//# Polymorphism: For obtaining polymorphism we have to create metod overriding and Upcasting simultaneously.
public class Main7 {

	public static void main(String[] args) {
		Vehicle vcl;  //  Creating Vehicle type of refrence
		Car cr = new Car();
		vcl = cr;  // UPCASTING by using upcasting vcl pointing towards car Object.
		vcl.start();
		vcl.stop();
		
		Bike bk = new Bike();
		vcl = bk;  // UPCASTING
		vcl.start();
		vcl.stop();
		
		
		
		

	}

}
