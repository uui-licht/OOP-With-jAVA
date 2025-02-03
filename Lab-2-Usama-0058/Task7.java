import java.util.Scanner;

class FindSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
        if (largest % 2 == 0) {
            System.out.println("The largest element " + largest + " is a multiple of 2.");
        } else {
            System.out.println("The largest element " + largest + " is NOT a multiple of 2.");
        }
    }
}
