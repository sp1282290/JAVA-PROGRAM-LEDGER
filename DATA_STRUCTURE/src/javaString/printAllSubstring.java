package javaString;

public class printAllSubstring {
public static void main(String[] args) {
	String str = "abcde";
	for(int i=0;i<=3;i++) {
		for(int j=i+1;j<=4;j++) {
			System.out.println(str.substring(i,j)+" ");
//			ab 
//			abc 
//			abcd 
//			b 
//			bc 
//			bcd 
//			c 
//			cd 
//			d 

		}
	}
}
}
