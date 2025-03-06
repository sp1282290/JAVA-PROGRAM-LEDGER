package array_Basics;

public class MainCloneEfficientForEachLoop {
	public static void main(String[] args) {
	String [] names = new String[5];
	names[0]="rajat";
	names[1]="RideIt";
	names[2]="Cattty";
	names[3]="jatt";
	names[4]="Fatty";
	for(String n: names)// For loop pickup the data one by one defaultly proceed from start and traversing to end it need container datatype variable for iterating from start to end 
		{
		System.out.println(n);
}
}
}