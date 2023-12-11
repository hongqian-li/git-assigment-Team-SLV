//********************************************************************************

// Main class to demonstrate the functionality of the Car class.
public class CarClass {

    public static void main(String[] args) {
        
        
        // Create the first Car object.
        Carr car1 = new Carr();
        
        
        // Using the toString() method and printing the information of the first car.
        System.out.println("First Car:\n" + car1.toString());
        System.out.println(" ");
        
        // Alternatively, print the object of the first car directly, which implicitly calls toString() method.
        System.out.println("First Car:\n" + car1);
        System.out.println(" ");
        

    }
}
//********************************************************************************
// Car.java


// Car class represents a car.
class Carr {

    
    // Instance variables representing the make, model, color, and year of the car.
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;
 
    
    // Override the toString() method to return a string containing car information.
    @Override
    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    } 
}
//********************************************************************************
