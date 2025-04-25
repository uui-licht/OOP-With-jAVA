import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in = input.nextLine();
        String modifiedString = in.replaceAll("\\s", "");
        System.out.println("Modified String: " + modifiedString);
        input.close();
    }
}
