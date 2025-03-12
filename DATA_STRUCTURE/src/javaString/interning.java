package javaString;

public class interning {
public static void main(String[] args) {
	String s ="hello"; // s and x  pointing towards same 'hello' until x new string is assigned, when new string is assigned  then x point towards "mello" string but hello is still there either "hello" is present garbage it is not deleted it is called interning. 
	String x="hello";
	x="mello"; // it override the string
	System.out.println(s);
	System.out.println(x);
	// IMMUTABILITY OF STRING(Security reigon)
	s = s.substring(0,2) +'y' +s.substring(3); // NEW STRING GENERATED NOT CHANGE THE STRING IT SEEMS TO BE YOUR STRING IS CHANGED-----> (You can change the refrence not a exact string)
	System.out.println(s);
	System.out.println(s);
}
}
