public class CarApp {	 
    public static void main(String[] args) {
        // Creating objects using different constructors
        Car car1 = new Car(); // Default constructor
        Car car2 = new Car("Honda", "Civic", 80); // Parameterized constructor

        // Using the printData method to display attribute values
        System.out.println("Car 1:");
        car1.printData();

        System.out.println("\nCar 2:");
        car2.printData();

        // Using the changeValues method to modify attribute values
        car1.changeValues("BMW", 70);
        car1.printData();
    }
}

class Car {
    //we declare attributes
    private String brand;
    private String model;
    private int amountOfFuel;

    //here is default constructor
    public Car() {
        this.brand = "";
        this.model = "";
        this.amountOfFuel = 0;
    }

    //this is parameterized constructor
    public Car(String brand, String model, int amountOfFuel) {
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
    }

    //here is method for printing attribute values
    public void printData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }

    //here is method to change attribute values
    public void changeValues(String newBrand, int newAmountOfFuel) {
        this.brand = newBrand;
        this.amountOfFuel = newAmountOfFuel;
        System.out.println("Values changed successfully.");
    }
}