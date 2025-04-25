public class Bike extends Vehicle {
    private String helmetType;

    public Bike(String brand, int speed, String helmetType) {
        super(brand, speed);
        this.helmetType = helmetType;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Helmet Type: " + helmetType);
    }
}
