import java.util.Scanner;

class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String in = input.nextLine();

		if (in.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
		input.close();
	}
}