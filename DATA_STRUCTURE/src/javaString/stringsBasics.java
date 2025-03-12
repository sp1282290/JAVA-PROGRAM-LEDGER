package javaString;
import java.util.*;
public class stringsBasics {
		public static void main(String[] args) {
//			char[] arr = new char[10];   character array---->String,  int array-----> Array
			Scanner scanner = new Scanner(System.in);
//			String str ="College Wallah";
//			System.out.println(str);
//			String s= sc.next(); // it only give first string not take space after a string
//			String s= sc.nextLine();
//			System.err.println(s);
			
			// LENGTH IN STRING
             String str = "hello";
             int len =str.length();
             System.out.println(len);//5
             System.out.println(str.length()); //5
             
             // ACCESSING CHARACTER IN ANY STRING
            /* DIRECT USE*/ System.out.println(str.charAt(0)); //  h
             System.out.println(str.charAt(1)); //  e
             System.out.println(str.charAt(2)); //  l
             System.out.println(str.charAt(3)); //  l
             System.out.println(str.charAt(4)); //  o
             /* DIRECT USE*/ char ch = str.charAt(1);
             System.out.println(ch);
             
             
             // Accessing index using character by using indexOf()
             String str1 = "Shivam";
             System.out.println(str1.indexOf('v'));  // 3
             
             // Comparing Two string by using comareTo() checking lexographicallly string
             // if both string are same then output is 0 , and if string 1 is 
            String a = "Shivam";
            String b = "Pathak";
            System.out.println(a.compareTo(b));  // 3  ('S' ASCII value or position value is greater then P position value thats why output is positive
            System.out.println(b.compareTo(a));   // -3 ('P' ASCII  value or position value is less then 'S' thats why output is negative
            System.out.println(a.compareTo(str1)); // 0 (because both string are same)
		   
            
            //  CHECKING SUBSTRING PRESENT IN ORIGINAL STRING OR NOT
       String c= "chotu";
       System.out.println(c.contains("otu"));  // true output is true or false
       System.out.println(c.startsWith("ch"));  // true
       System.out.println(c.endsWith("tu"));  // true
       
       
       // USING OF toLowerCase(),toUpperCase(), concat()
      //  STRINGS ARE IMMUTABLE IN JAVA
       String dev ="I want to become developer";
       String dev1 ="GIVE ME A TIME TO LEARN SKILL";
       System.out.println(dev.toUpperCase()); //  I WANT TO BECOME DEVELOPER
		 System.out.println(dev1.toLowerCase());  // give me a time to learn skill
		 System.out.println(dev.concat(dev1));  // I want to become developerGIVE ME A TIME TO LEARN SKILL
		 dev.concat(dev1); // no output not a right convention
	}
}


