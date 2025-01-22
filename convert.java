import java.util.Scanner;

class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double USD = scanner.nextDouble();
        int PKR = 280;
        System.out.println("The conversion of USD into PKR: " + (USD * PKR));

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
