class Car {

    // Non-static states (instance variables)
    String brand;
    String model;
    String color;
    double price;
    int speed;

    // Static states (class variables)
    static String companyName;
    static int numberOfWheels;

    public static void main(String[] args) {

        // Initialize static states
        companyName = "Automobile Industry";
        numberOfWheels = 4;

        // Create object
        Car c1 = new Car();

        // Initialize non-static states
        c1.brand = "Hyundai";
        c1.model = "Creta";
        c1.color = "White";
        c1.price = 1500000;
        c1.speed = 120;

        // Print non-static states
        System.out.println("Brand : " + c1.brand);
        System.out.println("Model : " + c1.model);
        System.out.println("Color : " + c1.color);
        System.out.println("Price : " + c1.price);
        System.out.println("Speed : " + c1.speed + " km/h");

        // Print static states
        System.out.println("Company Name : " + companyName);
        System.out.println("Number of Wheels : " + numberOfWheels);
    }
}