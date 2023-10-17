// Base class Shape
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        shape.draw();      // Calls the draw() method of the Shape class
        circle.draw();     // Calls the draw() method of the Circle class
        rectangle.draw();  // Calls the draw() method of the Rectangle class
        triangle.draw();   // Calls the draw() method of the Triangle class

        // Using the super keyword to call the superclass method
        circle.draw(); // Calls the draw() method of the Shape 
    }
}