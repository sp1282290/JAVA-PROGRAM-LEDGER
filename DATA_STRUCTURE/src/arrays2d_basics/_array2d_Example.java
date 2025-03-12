// Static 2d array program
package arrays2d_basics;
import java.util.Scanner;
public class _array2d_Example {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int [][] m = new int[2][3];
    m[0][0]=55;
    m[0][1]=23;
    m[0][2]=34;
    m[1][0]=46;
    m[1][1]=89;
    m[1][2]=79;
    for(int i=0; i<m.length; i++) {
    	for(int j=0; j<m[i].length; j++) {
    		System.out.print(m[i][j]+" ");
    	}
    	System.out.println();
    }
	
}
}
