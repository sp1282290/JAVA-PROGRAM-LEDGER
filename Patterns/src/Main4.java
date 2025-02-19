// Method Overriding and Method Hiding in one program.
public class Main4 { 
	public static void main(String[] args) {
		Developer dev;  // Declaration (no object created yet)
		dev = new JavaDeveloper(); // Object is created and assigned to 'dev'
		dev.work();
		dev.project();
		
		dev = new PythonDeveloper();
		dev.work();
		dev.project();
		
		dev = new c_Developer();
		dev.work();
		dev.project();
}

}
