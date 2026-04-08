package myproject;

// Base Class
class Shape {

    // Method Overloading - Circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    // Method Overloading - Rectangle
    void area(double length, double width) {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Derived Class
class Circle extends Shape {

    // Method Overriding
    @Override
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Overridden Circle Area: " + result);
    }
}

// Main Class
public class Shapes {

    public static void main(String[] args) {

        System.out.println("---- Method Overloading ----");

        Shape s = new Shape();
        s.area(3);          // Circle
        s.area(4, 5);       // Rectangle

        System.out.println("\n---- Method Overriding ----");

        Circle c = new Circle();
        c.area(3);          // Overridden method
    }
}