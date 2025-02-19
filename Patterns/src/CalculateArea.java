
class CalculateArea {
	public static void main(String[] args) {
		CalculateArea1 calcArea = new CalculateArea1();
		calcArea.findArea(2);
		calcArea.findArea(5,6);
		calcArea.findArea(8);
		
	}
}
 class CalculateArea1 {
	static void findArea(float r) {
		double area =  3.14f*r*r;
		System.out.println("The area of circle is: "+area);
	}
static void findArea(int length,double breadth) {
	double area = 2*length*breadth;
	System.out.println("The area of Rectangle is: "+area);
	}
static void findArea(double side) {
	double area = side*side;
	System.out.println("The area of Square is: "+area);
}

}
/*Method Overloading:>
1-No. of Parameter
2-Type of Parameter
3-Order of Parameter
class CalculateArea {
    public static void main(String[] args) {
        CalculateArea1.findArea(2.0f);  // Pass float explicitly
        CalculateArea1.findArea(5, 6);
        CalculateArea1.findArea(8);
    }
}

class CalculateArea1 {
    static void findArea(float r) {  // Made it static
        float area = (float) (Math.PI * r * r); // Use Math.PI for accuracy
        System.out.println("The area of the circle is: " + area);
    }

    static void findArea(int length, int breadth) {
        int area = length * breadth;  // Removed incorrect 2* (perimeter uses 2, not area)
        System.out.println("The area of the rectangle is: " + area);
    }

    static void findArea(int side) {
        int area = side * side;
        System.out.println("The area of the square is: " + area);
    }
}*/

