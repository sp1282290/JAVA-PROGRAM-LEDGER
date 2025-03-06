	import java.util.Scanner;

	class Shape2 {
	    public static void main(String[] args) {
	      //Anonymous obect are object is created when you use the object one time only
	        shapeMethods(new Circle()); //Creating circle object and passing it to Shape shp
	        shapeMethods(new Rectangle());  //Creating Rectangle object and passing it to Shape shp
	        shapeMethods(new Square());//Creating Square object and passing it to Shape shp
	   }
	    static void shapeMethods(Shape shp) { //1 by 1 it is pointing to circle,then rectangle and then Square
	    	shp.acceptInput();
	    	shp.calculateArea();
	    	shp.displayArea();
	    }
	}

	// Parent class
	class Shape1 {
	    double area;
	    int radius, length, breadth, side;  // Declare variables here

	    void acceptInput() {
	        System.out.println("Accepting input for shape:");
	    }

	    void calculateArea() {
	        System.out.println("The calculated area for shape is:");
	    }
	    void displayArea() {
	        System.out.println("Displaying the area of shape1");
	    }
	}

	// Circle Class
	class Circle extends Shape1 {
	    @Override
	    void acceptInput() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        radius = sc.nextInt();
	    }

	    @Override
	    void calculateArea() {
	        area = Math.PI * Math.pow(radius, 2);
	        System.out.println("The calculated area of Circle is: " + area);
	    }
	    @Override
	    void displayArea() {
	        System.out.println("Displaying the area of Circle: " + area);
	    }
	}

	// Rectangle Class
	class Rectangle extends Shape1 {
	    @Override
	    void acceptInput() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the length of the rectangle: ");
	        length = sc.nextInt();
	        System.out.print("Enter the breadth of the rectangle: ");
	        breadth = sc.nextInt();
	    }

	    @Override
	    void calculateArea() {
	        area = length * breadth;
	        System.out.println("The calculated area of Rectangle is: " + area);
	    }
	    @Override
	    void displayArea() {
	        System.out.println("Displaying the area of Rectangle: " + area);
	    }
	}

	// Square Class
	class Square extends Shape1 {
	    @Override
	    void acceptInput() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the side of the square: ");
	        side = sc.nextInt();
	    }

	    @Override
	    void calculateArea() {
	        area = side * side;
	        System.out.println("The calculated area of Square is: " + area);
	    }
	    @Override
	    void displayArea() {
	        System.out.println("Displaying the area of Square: " + area);
	    }
	}

