public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020, 4);
        Car car2 = new Car("Honda", "Civic", 2019, 4);
        Truck truck = new Truck("Volvo", "FH16", 2021, 50000);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, false);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(truck);
        System.out.println(motorcycle);

        car1.start();
        car1.stop();
        truck.start();
        truck.stop();
        motorcycle.start();
        motorcycle.stop();

        System.out.println("Total cars created: " + Car.getCarCount());
    }
}