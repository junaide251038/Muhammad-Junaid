// Abstract class
abstract class Shape {
    abstract double area();  // abstract method
}

// Circle subclass
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.1416 * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + r.area());
    }
}

