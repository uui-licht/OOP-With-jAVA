import java.util.Scanner;

class CheckNameInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[6];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine().trim();
        }

        boolean isAliPresent = false;
        for (String name : names) {
            if (name.equalsIgnoreCase("Ali")) {
                isAliPresent = true;
                break;
            }
        }

        System.out.println(isAliPresent ? "Yes, the name 'Ali' is present in the array." : "No, the name 'Ali' is not present in the array.");
    }
}
