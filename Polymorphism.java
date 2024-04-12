package Aspire;

//Define a Shape class as the base class
class Shape {
 protected String name;

 public Shape(String name) {
     this.name = name;
 }

 // Method to calculate area (to be overridden by subclasses)
 public double calculateArea() {
     return 0; // Default implementation for the sake of the example
 }
}

//Define a Rectangle class that extends Shape
class Rectangle extends Shape {
 private double width;
 private double height;

 public Rectangle(String name, double width, double height) {
     super(name);
     this.width = width;
     this.height = height;
 }

 // Override calculateArea method to calculate area of rectangle
 @Override
 public double calculateArea() {
     return width * height;
 }
}

//Define a Circle class that extends Shape
class Circle extends Shape {
 private double radius;

 public Circle(String name, double radius) {
     super(name);
     this.radius = radius;
 }

 // Override calculateArea method to calculate area of circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

public class Polymorphism {

    	// Function to calculate area of a square
        public static double calculateArea(double side) {
            return side * side;
        }

        // Function to calculate total area of an array of shapes
        public static double totalArea(Shape[] shapes) {
            double total = 0;
            for (Shape shape : shapes) {
                total += shape.calculateArea();
            }
            return total;
        }

        // Main method
        public static void main(String[] args) {
            // Create instances of Rectangle and Circle
            Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
            Circle circle = new Circle("Circle", 7);

            // Calculate total area of shapes
            Shape[] shapes = {rectangle, circle};
            double total = totalArea(shapes);

            // Calculate area of a square
            double squareArea = calculateArea(4);

            // Output total area and area of square
            System.out.println("Total area of shapes: " + total);
            System.out.println("Area of a square: " + squareArea);
    }
}