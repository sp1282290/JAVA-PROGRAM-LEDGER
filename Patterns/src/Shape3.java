import java.util.Scanner;

class Shape {
    public static void main(String[] args) {
    	 //Anonymous obect are object is created when you use the object one time only
        shapeMethods(new Circle()); //Creating circle object and passing it to Shape shp
        shapeMethods(new Rectangle());  //Creating Rectangle object and passing it to Shape shp
        shapeMethods(new Square());//Creating Square object and passing it to Shape shp
   }
    static void shapeMethods(Shape shp) { // Upcasting shp to Circle
    	shp.acceptInput();
    	shp.calculateArea();
    	if(shp instanceof Circle) { 
    	((Circle)(shp)).displayCircleArea(); //downcasting Shape to Circle
    	}
    	else if(shp instanceof Rectangle) {   // instanceof is a keyword in java that is used to check the one object is referring towards another object or not,it is used to check refrence variable belongs to which class
         (( Rectangle)(shp)).displayRectangleArea(); //downcasting Shape to Rectangle
    	}
    	else {
         ( (Square)(shp)).displaySquareArea(); //downcasting Shape to Square
    }
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

    void displayCircleArea() {
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

    void displayRectangleArea() {
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

    void displaySquareArea() {
        System.out.println("Displaying the area of Square: " + area);
    }
}
