// WAC TO CHECK THE STRING IS PALINDROME OR NOT
package javaString;

public class usingTwoPointerCheckPalindromeString {
public static void main(String[] args) {
	String str = "abcdcba";
	int i = 0;
	int j = str.length()-1;
	boolean flag = true;
	while(i<j) {
		if(str.charAt(i)!= str.charAt(j)) {
			flag = false;
			break;
			
		}
		i++;
		j--;
	}
	if(flag==true) System.out.println(str+" is a palindrome");
	else System.out.println(str+ " is Not a palindrome");
			}
}
