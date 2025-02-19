
class Parent1 {
    static void display1() {
        System.out.println("Inside parent display1");
    }

    static void display2() {
        System.out.println("Inside parent display2");
    }
}

class Child1 extends Parent1 {
    // Removed @Override since static methods cannot be overridden
    static void display2() {
        System.out.println("Inside Child display2");
    }
}

class Main2 {
    public static void main(String[] args) {
        Parent1.display1();  // Calls Parent's display1()
        Parent1.display2();  // Calls Parent's display2()
        Child1.display1();   // Calls Parent's display1() (inherited)
        Child1.display2();   // Calls Child's display2() (hides Parent's)
    }
}
