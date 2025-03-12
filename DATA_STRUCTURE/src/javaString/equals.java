package javaString;

public class equals {
public static void main(String[] args) {
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");
System.out.println(s1==s2); //true
System.out.println(s1==s3);  //false  because firstly it check the address thats why it give a false
// if you are creating a string using new keyword then you are not permitted to use the == operator with this string rather then u have to use the str.equals() for mentioned string because it point towards value of string not a address of string
System.out.println(s1.equals(s3)); // true
}
}
