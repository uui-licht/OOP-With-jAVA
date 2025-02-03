import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 4, cols = 4;
        int[][] seats = new int[rows][cols];
        int choice;

        do {
            System.out.println("1. Display available seats");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available seats (0 = available, 1 = reserved):");
                    for (int i = 0; i < seats.length; i++) {
                        for (int j = 0; j < seats[i].length; j++) {
                            System.out.print(seats[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter row number (0-" + (rows - 1) + "): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column number (0-" + (cols - 1) + "): ");
                    int col = scanner.nextInt();
                    if (row >= 0 && row < rows && col >= 0 && col < cols) {
                        if (seats[row][col] == 0) {
                            seats[row][col] = 1;
                            System.out.println("Seat reserved successfully.");
                        } else {
                            System.out.println("Seat is already reserved.");
                        }
                    } else {
                        System.out.println("Invalid range.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
