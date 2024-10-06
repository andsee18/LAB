class Car extends Vehicle {
    private int numberOfDoors;
    private static int carCount = 0;

    public Car() {
        this("Unknown", "Unknown", 0, 4);
    }

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        carCount++;
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car engine.");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public static int getCarCount() {
        return carCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}