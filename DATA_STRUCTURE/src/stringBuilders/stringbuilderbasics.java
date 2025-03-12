package stringBuilders;

public class stringbuilderbasics {
 public static void main(String[] args) {
	StringBuilder str = new StringBuilder("hello"); // String------> interning-----> immutability-------->poor porformance : it is overcome by StringBuilder
//  StringBuilder str = new StringBuilder(capacity:16);  default size of string under string builder are 16
	//StringBuilder str = new StringBuilder(capacity:100); //
	str.append("world");
	System.out.println(str);
	str.setCharAt(0, 'm'); // it is used for changing the character
	System.out.println(str); // melloworld
	str.append("world");
	str.append(false);
	System.out.println(str);
	str.append(345);
	System.out.println(str);
	str.append(34.56);
	System.out.println(str);
	str.append('d');
	System.out.println(str);
	str.insert(2,'e');  // it insert the character at defined index by replacing the right side to next index and then insert
	System.out.println(str);
	str.deleteCharAt(0);// it delete the charactrer at defined index
	System.out.println(str);
	StringBuilder str1 = new StringBuilder("helloWorld");
	str1.reverse();  // it reverse the string
	System.out.println(str1);//dlroWolleh
	StringBuilder str2 = new StringBuilder("helloBuddyHowAreYou");
	str2.delete(2,5);
	System.out.println(str2); // heBuddyHowAreYou
	// indexOf(), substring() is both available	
	
	
 }
}
