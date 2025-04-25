import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split(" ");
        int wordCount = words.length;
        System.out.println("Words:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("Total words: ");
        if (wordCount == 0) {
            System.out.println("0");
        } else {
            System.out.println(wordCount);
        }
        scanner.close();
    }
}