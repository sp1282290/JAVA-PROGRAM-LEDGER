package javaString;
import java.util.*;
public class stringcharint {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = "abc";
	str+="def";
	str+='r';  // firstly 'r' which is present in the form of character it is converted into string the concatinate
	str+=10; // firstly 10 which is in integer form it can be converted in to string then concatinate
	System.out.println(str);
	System.out.println("faltu"+"kakaam");  //faltukakaam
	System.out.println("faltu"+'d');  // faltud
	System.out.println("faltu"+10);   // faltu10
	System.out.println("faltu"+10+20);  // faltu1020
	System.out.println(+10+20+"faltu");  //30faltu   precedency from left to right
	System.out.println("faltu"+(10+20));  // faltu30  BODMAS  rule priority first given to brackets
}
}
