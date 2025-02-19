class Parent {
	static void display1() {
		System.out.println("Inside parent display1");
	}
	static void display2() {
		System.out.println("Inside parent display2");
}
}
class Child extends Parent{
	@Override  // O should be in capital letter
	static void display2() {
		System.out.println("Inside Child display2");
	}
}
class Main3 {
	public static void main(String[] args) {
		Parent p = new Parent(); //Parent p = new Child(); // UPCASTING:  child class ka object bana kar parent ko assign kar do usi ko upcasting kahte hain
		p.display1();
		p.display2();
		Child ch = new Child();
		ch.display1();
		ch.display2();
		p= ch;  // UPCASTING
		p.display1();/* Polymorphism:  Polymorphism is a concept in object-oriented programming that allows one 
		interface to be used for different data types. In simple words, it means that a single function, method,
		 or class can behave differently depending on the object it is acting upon.*/
		p.display2();
		
}
}


