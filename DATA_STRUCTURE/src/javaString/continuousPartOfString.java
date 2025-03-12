package javaString;

public class continuousPartOfString {
public static void main(String[] args) {
	String str = "rockerz";
	System.out.println(str.substring(0,5));  // rocke
	System.out.println(str.substring(0,0)); // no output
	System.out.println(str.substring(3));   //kerz
	System.out.println(str.substring(0));   // rokerz
	
	// SUBSTRING(I,J)
	String s = "Artificial";
	for(int i=2;i<4;i++) {
		System.out.println(s.substring(i)); // tificial ificial
	}
	
}
}
