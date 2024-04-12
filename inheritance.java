package Aspire;

// Parent class
class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method in the parent class
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String color, int numberOfDoors) {
        super(brand, color);
        this.numberOfDoors = numberOfDoors;
    }

    // Method overriding the drive method in the parent class
    @Override
    public void drive() {
        System.out.println("Car is being driven.");
    }

    // Additional method specific to Car class
    public void honk() {
        System.out.println("Car is honking.");
    }
}

// Child class inheriting from Vehicle
class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String brand, String color, int engineCapacity) {
        super(brand, color);
        this.engineCapacity = engineCapacity;
    }

    // Method overriding the drive method in the parent class
    @Override
    public void drive() {
        System.out.println("Bike is being driven.");
    }

    // Additional method specific to Bike class
    public void ringBell() {
        System.out.println("Bike is ringing bell.");
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {
        // Create instances of Car and Bike
        Car myCar = new Car("Toyota", "Red", 4);
        Bike myBike = new Bike("Honda", "Blue", 150);

        // Call methods inherited from Vehicle class
        myCar.drive();  // Output: Car is being driven.
        myBike.drive(); // Output: Bike is being driven.

        // Call methods specific to Car and Bike classes
        myCar.honk();   // Output: Car is honking.
        myBike.ringBell();  // Output: Bike is ringing bell.
    }
}