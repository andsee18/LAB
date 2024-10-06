class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck() {
        this("Unknown", "Unknown", 0, 0);
    }

    public Truck(String brand, String model, int year, int cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Starting the truck engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the truck engine.");
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", cargoCapacity=" + cargoCapacity +
                '}';
    }
}