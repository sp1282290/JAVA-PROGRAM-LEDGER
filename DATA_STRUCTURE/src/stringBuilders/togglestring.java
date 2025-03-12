package stringBuilders;

import java.util.Scanner;

public class togglestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "PhYSiCS";
		System.out.println(str);
		//StringBuilder str = new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
	
		// toggle
		// Shivam --->  sHiVam

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
				str = str.substring(0,i) + dh + str.substring(i+1);
				
			} 
			else//small
			{
				asci -=32;
				char dh = (char)asci;
			str = str.substring(0,i) + dh + str.substring(i+1);			
			}
			
		}
		System.out.println(str);
	}
}

