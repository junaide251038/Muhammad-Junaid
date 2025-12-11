class Shape {

    // Rectangle area method
    double area(double length, double width) {
        return length * width;
    }

    // Circle area method
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

// Main class to test Shape class
public class Main {
    public static void main(String[] args) {

        Shape s = new Shape();

        System.out.println("Rectangle Area: " + s.area(10, 5));
        System.out.println("Circle Area: " + s.area(7));
    }
}
