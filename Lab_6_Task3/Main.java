class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, "Sedan");
        Bike bike = new Bike("Honda", 120, "Full-face");

        System.out.println("Car Details:");
        car.showDetails();

        System.out.println("\nBike Details:");
        bike.showDetails();
    }
}