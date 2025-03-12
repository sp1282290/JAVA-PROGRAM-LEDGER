// The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
// Input - aaabbbbccddde
//Output-a3b4c2d3e

package stringBuilders;

public class StringCompression {
	public static void main(String[] args) {
		
	
String str = " aaabbbbccddde";
String ans = "" +str.charAt(0);  // a3b
int count = 1;
for(int i=1;i<str.length();i++) {
	char current = str.charAt(i);
	char previous = str.charAt(i-1);
	if(current==previous) {
		count++;
	}
	else
	{  
		ans +=count;
		count = 1;
		ans+=current;
		}
}
ans +=count;
System.out.println(ans);
}
}

