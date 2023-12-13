import java.util.Scanner;
public class commit {

    public static void main(String[] args) {
        //Creates new car objects
        Scanner in = new Scanner(System.in);
        Car car = new Car("Toyota", "RAV4", 40);
    while(true) 
    {
        System.out.println("a=accelerate, b=brake, s=speed, r=refuel, x=exit"); 
        String answer = in.nextLine();   
        if (answer.equals("a"))
        {
            car.accelerate();
        }
        else if (answer.equals("b"))
        {
            car.brake();
        }
        else if (answer.equals("r"))
        {
            System.out.println("Enter the amount to refuel");
            int refuelAmount = in.nextInt();
            in.nextLine();
            car.refuel(refuelAmount);
        }
        else if (answer.equals("s"))
        {
            car.speed();
        }
        else if (answer.equals("x"))
        {
            break;
        }
    }
 }
}

class Car {
    private String brand;
    private String model;
    private int amountOfFuel;

    // Default constructor
    public Car() {
        brand = "";
        model = "";
        amountOfFuel = 0;
        printData();
    }

    // Constructor with brand name, model, and amount of fuel
    public Car(String brandName, String modelName, int fuelAmount) {
        brand = brandName;
        model = modelName;
        amountOfFuel = fuelAmount;
        printData();
    }

    // Getter method for model
    public String getModel() {
        return model;
    }

    // Setter method for model
    public void setModel(String newModel) {
        model = newModel;
    }

    // Method that prints brand, model, and amount of fuel in the tank
    private void printData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }

    // Braking method
    public void brake() {
        System.out.println("Car is braking.");
    }

    // Accelerate method prints that the car is accelerating and subtracts -1 from fuel amount,
    // Outputs "You don't have enough fuel" if fuel amount is 0
    public void accelerate() {
        if (amountOfFuel > 0) {
            System.out.println("Car is accelerating.");
            amountOfFuel--;
            System.out.println("You have " + amountOfFuel + " fuel left.");
        } else {
            System.out.println("You don't have enough fuel!");
        }
    }

    public void speed() {
        if (amountOfFuel > 0) {
            System.out.println("Car is accelerating fast.");
            amountOfFuel-=10;
            System.out.println("You have " + amountOfFuel + " fuel left.");
        } else {
            System.out.println("You don't have enough fuel!");
        }
    }
    // Refuel method, prints amount of fuel currently in the tank, then prints amount of fuel we specified to refuel, and lastly prints fuel amount after refuel
	public void refuel(int amount)
	{
		System.out.println("Fuel in the tank: " + amountOfFuel);
		System.out.println("Refuel: " + amount);
		System.out.println("Fuel in the tank after the refuel: " + (amountOfFuel+amount));
	}
}
