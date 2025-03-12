// WAC TO CHECK THE STRING IS PALINDROMIC OR NOT
package javaString;

import array_Basics.Main;

public class checkpalindromicString {
public static void main(String[] args) {
	String str = "abcdcba";
	StringBuilder gtr = new StringBuilder(str);
	gtr.reverse();
	String s = gtr +"";   // hacks---->adding stringBuilder into empty string 
	if(str.equals(s)) {
		System.out.println(str+" is a Palindrome");
	}
	else
	{
		System.out.println(str+" is Not a Palindrome");
	}
}
}
