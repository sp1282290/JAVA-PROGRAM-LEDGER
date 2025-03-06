package array_Basics;

public class MainCloneEfficient {
public static void main(String[] args) {
	String [] names = new String[5];
	names[0]="raj";
	names[1]="Rat";
	names[2]="Cat";
	names[3]="Zat";
	names[4]="Fat";
	//for(int i=0;i<=4;i++) Both Loop can used individually ,both are correct
		for(int i=0;i<names.length;i++)
	{ 
		System.out.println(names[i]);
	}
}
}
