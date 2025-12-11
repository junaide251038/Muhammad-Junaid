class Calculator {

    // Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adds two floating-point numbers
    double add(double a, double b) {
        return a + b;
    }

    // Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Task 2: Shape class with Method Overloading
class Shape {

    // Rectangle area
    double area(double length, double width) {
        return length * width;
    }

    // Circle area
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

// Main Class to Test
public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println("Add (int,int): " + c.add(10, 20));
        System.out.println("Add (double,double): " + c.add(5.5, 3.3));
        System.out.println("Add (int,int,int): " + c.add(1, 2, 3));

        Shape s = new Shape();
        System.out.println("Rectangle Area: " + s.area(5, 10));
        System.out.println("Circle Area: " + s.area(7));
    }
}
