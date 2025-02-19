import java.util.Scanner;

class Shape {
    public static void main(String[] args) {
        Shape1 shp;

        // Creating an object dynamically
        shp = new Circle();   // UPCASTING
        shp.acceptInput();
        shp.calculateArea();
        ((Circle)(shp)).displayCircleArea();  //DOWNCASTING
        
        shp = new Rectangle();  // UPCASTING
        shp.acceptInput();
        shp.calculateArea();
        (( Rectangle)(shp)).displayRectangleArea();   //DOWNCASTING

        shp = new Square();   // UPCASTING
        shp.acceptInput();
        shp.calculateArea();
       ( (Square)(shp)).displaySquareArea();   //DOWNCASTING
       
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
