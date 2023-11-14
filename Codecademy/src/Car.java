public class Car {
  String color;
  // new fields!
  boolean isRunning;
  int velocity;
  int milesDriven;

  
  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour) {
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
    milesDriven = 0;
  }

  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }

  public void drive() {
    String message = "Miles driven: " + milesDriven;
    System.out.println(message);
  }

// Method 1
  public void startRadio(double stationNum, String stationName) {
    System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
    System.out.println("Enjoy!");
  }
  
// Method 2
  public void startRadio(double stationNum) {
    System.out.println("Turning on the radio to " + stationNum + "!");
  }

  public int numberOfTires() {
    int tires = 4;
    // return statement
    return tires;
  }
  
  public String toString(){
    return "This is a " + color + " car!";
  }

  public static void main(String[] args) {
    // new values passed into the method call
    Car ferrari = new Car("red", true, 27);
    Car renault = new Car("blue", false, 70);
    
    System.out.println(renault.isRunning);
    // false
    System.out.println(ferrari.velocity);
    // 27
    Car myCar = new Car("red");
    // Call a method on an object 
    myCar.startEngine();
    System.out.println("That was one fast car!");
    
    // Calls the first startRadio() method
    myCar.startRadio(103.7, "Meditation Station");

    // Calls the second startRadio() method
    myCar.startRadio(98.2);

    int numTires = myCar.numberOfTires();
  }
}

class CarLot {
    Car carInLot;
    public CarLot(Car givenCar) {
        carInLot = givenCar;
    }

    public Car returnACar() {
        // return Car object
        return carInLot;
    }

    public static void main(String[] args) {
        Car myCar = new Car("red", 70);
        System.out.println(myCar); 
        CarLot myCarLot = new CarLot(myCar);
        System.out.println(myCarLot.returnACar());
    }
}