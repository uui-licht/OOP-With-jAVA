import java.util.Scanner;

class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String in = input.nextLine();
		if (in.startsWith("Hello")) {
			System.out.println("Starts with Hello");
		} else {
			System.out.println("Does not start with Hello");
		}
		input.close();
	}
}
