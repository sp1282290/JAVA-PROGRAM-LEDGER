// WAC FOR THE TASK IS TO TOGGLE ALL CHARACTERS OF STRING I.E. TO CONVERT UPPERCASE TO LOWERCASE AND VICE-VERSA
package stringBuilders;
import java.util.*;
public class toggle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder str = new StringBuilder(sc.nextLine());
	System.out.println(str);
	// toggle
	// Shivam --->  sHiVam
	for(int i=0;i<str.length();i++) {
		// S--s
		//check---> alphabet--- small, capital
		boolean flag = true;
		char ch = str.charAt(i);
		if(ch==' ') continue;
		int asci = (int) ch;  //65
		if(asci>=97) flag = false; //small
		if(flag==true) {
			asci+=32;
			char dh = (char)asci; //a
			str.setCharAt(i, dh);
		} 
		else//small
		{
			asci -=32;
			char dh = (char)asci;
			str.setCharAt(i, dh);
		}
		
	}
	System.out.println(str);
}
}
