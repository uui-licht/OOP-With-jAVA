import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 76;
        System.out.println("Number 1: " + num1);

        int num2 = 23;
        System.out.println("Number 2: " + num2);

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an action (1-4): ");
        int choice = scanner.nextInt();

        int result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Result: " + result);
    }
}
