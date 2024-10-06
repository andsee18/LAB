class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle() {
        this("Unknown", "Unknown", 0, false);
    }

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle engine.");
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hasSidecar=" + hasSidecar +
                '}';
    }
}