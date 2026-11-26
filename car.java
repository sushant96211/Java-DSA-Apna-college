
class Car {

    // Data members (Properties)
    String brand;
    String color;
    int speed;
    int price;

    // Method (Behaviour)
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Price: " + price);
    }

    void drive() {
        System.out.println(brand + " is driving...");
    }
}

public class car {

    public static void main(String[] args) {

        // Creating object
        Car c1 = new Car();

        // Assigning values
        c1.brand = "BMW";
        c1.color = "Black";
        c1.speed = 250;
        c1.price = 5000000;

        // Calling methods
        c1.display();
        c1.drive();
    }
}
