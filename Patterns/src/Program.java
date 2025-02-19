class Program {
	static int x,y;
	static {
		System.out.println("Inside static block");
		x=10;
		y=20;
	}
	static void display1() {
		System.out.println("Inside static method");
		System.out.println(x);
         System.out.println(y);
	}
	int p,q;
	{

		System.out.println("Inside non-Static block");
		x = 111;
		y = 222;
		p = 333;
		q = 444;
	}
	void display2()
	{
		System.out.println("Inside non-Static method");
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		System.out.println(q);
		
	}
	public static void main(String[] args) {
		Program.display1();
		Program pr = new Program();
		pr.display2();
		
	}
	
}