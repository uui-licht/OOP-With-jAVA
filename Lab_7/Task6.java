import java.util.Scanner;

class Task6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String in = input.nextLine();
		if (in.contains("java")) {
			System.out.println("Contains java");
		} else {
			System.out.println("Does not contain java");
		}
		input.close();
	}
}
