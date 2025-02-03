import java.util.Scanner;

    class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in miles: ");
        double mile = scanner.nextDouble();

        double km = mile * 1.60934;

        System.out.println("The distance after conversion from miles to kilometers: " + km);

        scanner.close();
    }
}
