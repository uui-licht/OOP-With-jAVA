public class Car extends Vehicle {
    private String carType;

    public Car(String brand, int speed, String carType) {
        super(brand, speed);
        this.carType = carType;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Car Type: " + carType);
    }
}