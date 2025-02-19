
public class Main5 {
public static void main(String[] args) {
	Laptop lap = new Laptop(); // It will create Laptop object as well as Os Object
	lap.os.name="Windows";  //  Using Os from Laptop
	System.out.println(lap.os.name);
	lap.os.osWork();//  Using Os from Laptop
	
	
	Charger chgr = new Charger();//Creating Object of charger
	lap.hasA(chgr);  // Using Charger from Laptop
	chgr.color="Black"; // Using Charger from Charger
	System.out.println(chgr.color);
	chgr.charge();   // Using Charger from Charger
}
}
