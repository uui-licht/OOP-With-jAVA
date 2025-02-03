import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Add start of prime: ");
            int start = input.nextInt();

            System.out.print("Add range of number: ");
            int range = input.nextInt();

            for (int i = start; i <= range; i++) {
                if (i == 2 || i == 3 || i == 5 || i == 7 || i == 11) {
                    System.out.println(i);
                } else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0) 
            {
                    	System.out.println(i);
                	}
}
        }
}
}
