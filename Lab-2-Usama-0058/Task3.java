import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter value of columns: ");
        int col = scanner.nextInt();

        int sum = 0;
        int arr[][] = new int[row][col];
        int arr2[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value for arr: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; b++) {
                System.out.print("Enter value for arr2: ");
                arr2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sum of corresponding elements of arr and arr2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + arr2[i][j] + " \t ");
            }
            System.out.println();
        }
    }
}
