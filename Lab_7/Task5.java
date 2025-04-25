import java.util.Scanner;

class Task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String in = input.nextLine();
		if (in.endsWith("World")) {
			System.out.println("Ends with World");
		} else {
			System.out.println("Does not end with World");
		}
		input.close();
	}
}
